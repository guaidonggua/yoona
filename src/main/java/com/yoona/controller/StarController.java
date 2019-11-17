package com.yoona.controller;

import com.yoona.entity.Star;
import com.yoona.service.IStarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: AI
 * @Date: 2019/11/12 11:10
 * @Version: 1.0
 */
@RestController
@RequestMapping("/star")
public class StarController {

    @Resource(name = "StarService")
    private IStarService starService;

    @GetMapping("/getByID")
    public ResponseEntity<Object> getByID(@RequestParam("id") Integer id) {
        Star star = starService.getByID(id);
        return ResponseEntity.ok(star);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody Map<String, Object> requestBody) {
        // 参数判断为空先不考虑，你熟练了再加
        Map<String, Object> map = starService.add(requestBody);
        return ResponseEntity.ok(map);
    }
}
