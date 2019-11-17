package com.yoona.service.impl;

import com.yoona.dao.StarMapper;
import com.yoona.entity.Star;
import com.yoona.service.IStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: AI
 * @Date: 2019/11/12 11:04
 * @Version: 1.0
 */
@Service(value = "StarService")
public class StarServiceImpl implements IStarService {

    @Autowired
    private StarMapper starMapper;

    @Override
    public Star getByID(Integer sid) {
        return starMapper.selectByPrimaryKey(sid);
    }

    @Override
    public Map<String, Object> add(Map<String, Object> requestBody) {
        Star star = new Star();
        Date now = new Date();
        star.setStarName(requestBody.get("star_name").toString());
        star.setStarSex(Integer.parseInt(requestBody.get("star_sex").toString()));
        star.setMovie(requestBody.get("movie").toString());
        star.setCreated(now);
        star.setUpdated(now);
        Map<String, Object> map = new HashMap<>();
        int n = starMapper.insert(star);
        if(n == 1) {
            map.put("message", "添加成功");
        } else {
            map.put("message", "添加失败");
        }
        return map;
    }
}
