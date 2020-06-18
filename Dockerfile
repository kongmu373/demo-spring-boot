FROM adoptopenjdk/openjdk8:jdk8u232-b09-ubuntu-slim

RUN mkdir /app

WORKDIR /app

COPY target/demo-spring-boot-1.0-SNAPSHOT.jar /app

EXPOSE 8080

CMD [ "java", "-jar", "demo-spring-boot-1.0-SNAPSHOT.jar" ]
