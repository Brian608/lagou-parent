package org.feather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-15 21:22
 **/
@RestController
@RequestMapping("/autodeliver")
public class AutoDeliverController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/checkState/{userId}")
    public  Integer findResumeOpenState(@PathVariable Long userId){
        //调用远程服务，简历微服务接口
        Integer forObject = restTemplate.getForObject("http://localhost:8080/resume/openstate/"+userId, Integer.class);
        return forObject;
    }
}
