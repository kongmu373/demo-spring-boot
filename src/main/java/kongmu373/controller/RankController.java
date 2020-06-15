package kongmu373.controller;


import kongmu373.entity.Rank;
import kongmu373.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController
public class RankController {

    @Autowired
    private RankService rankService;

    @RequestMapping("/")
    public ModelAndView index() {
        List<Rank> rankItems = rankService.getRankItems();
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", rankItems);
        return new ModelAndView("index", map);
    }


}
