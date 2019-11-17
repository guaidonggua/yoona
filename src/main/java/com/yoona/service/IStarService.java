package com.yoona.service;

import com.yoona.entity.Star;

import java.util.Map;

/**
 * @Author: AI
 * @Date: 2019/11/12 11:02
 * @Version: 1.0
 */
public interface IStarService {

    Star getByID(Integer sid);

    Map<String, Object> add(Map<String, Object> requestBody);

}
