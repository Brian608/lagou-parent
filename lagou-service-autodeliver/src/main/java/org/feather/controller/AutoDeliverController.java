package org.feather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    @Autowired
    private DiscoveryClient discoveryClient;

//    @GetMapping("/checkState/{userId}")
//    public  Integer findResumeOpenState(@PathVariable Long userId){
//        //调用远程服务，简历微服务接口
//        Integer forObject = restTemplate.getForObject("http://localhost:8080/resume/openstate/"+userId, Integer.class);
//        return forObject;
//    }

    /**
     * 服务注册到eureka之后的改造
     * @param userId
     * @return
     */
        @GetMapping("/checkState/{userId}")
        public  Integer findResumeOpenState(@PathVariable Long userId){
            //TODO 从eureka server中获取我们关注的那个服务的实力信息以及接口信息
            //1。从eureka server中获取lagou-service-resume服务的实例信息（使用客户端做这件事）
            List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("lagou-service-resume");
            //2.如果有多个实例，选择第一个
            ServiceInstance serviceInstance = serviceInstanceList.get(0);
            //3.从元数据信息获取host ，port
            String host = serviceInstance.getHost();
            int port = serviceInstance.getPort();
            String url="http://"+host+":"+port+"/resume/openstate/"+userId;


            Integer forObject = restTemplate.getForObject(url, Integer.class);
            return forObject;
         }
}
