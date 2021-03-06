package org.feather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-15 20:43
 **/
@SpringBootApplication
@EntityScan("org.feather.pojo")
@EnableDiscoveryClient
public class ResumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class,args);
    }
}
