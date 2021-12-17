package org.feather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-17 22:49
 **/
@SpringBootApplication
@EnableEurekaServer
public class LagouEurekaServerApplication8761 {
    public static void main(String[] args) {
        SpringApplication.run(LagouEurekaServerApplication8761.class,args);
    }
}
