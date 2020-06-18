package kongmu373.dao;


import kongmu373.config.Cache;
import kongmu373.entity.Rank;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RankDao {
    @Autowired
    private SqlSession sqlSession;


    @Cache
    public List<Rank> selectRankItemList() {
        return sqlSession.selectList("MyMapper.selectRankItemList");
    }
}
