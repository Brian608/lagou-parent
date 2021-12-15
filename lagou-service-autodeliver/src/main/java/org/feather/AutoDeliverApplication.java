package org.feather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-15 21:29
 **/
@SpringBootApplication
public class AutoDeliverApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoDeliverApplication.class,args);
    }

    //使用RestTemplate模版对象进行远程调用
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
