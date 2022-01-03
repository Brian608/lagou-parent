package org.feather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-01-02 23:06
 **/
@EnableEurekaClient
@SpringBootApplication
public class OauthServerApplication9999 {
    public static void main(String[] args) {
        SpringApplication.run(OauthServerApplication9999.class,args);
    }
}
