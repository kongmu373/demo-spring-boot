package kongmu373.service;

import kongmu373.dao.RankDao;
import kongmu373.entity.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    private RankDao rankDao;

    public List<Rank> getRankItems() {
        return rankDao.selectRankItemList();
    }
}
