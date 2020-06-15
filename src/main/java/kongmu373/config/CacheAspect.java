package kongmu373.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Aspect
@Configuration
public class CacheAspect {
    @Autowired
    private RedisTemplate redisTemplate;

    @Around("@annotation(kongmu373.config.Cache)")
    public Object cache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        String name = signature.getName();
        Object cachedValue = redisTemplate.opsForValue().get(name);
        if(cachedValue == null) {
            System.out.println("Get value from database!");
            cachedValue = proceedingJoinPoint.proceed();
            redisTemplate.opsForValue().set(name, cachedValue);
        } else {
            System.out.println("Get value from cache");
        }

        return cachedValue;
    }
}
