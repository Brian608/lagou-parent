package org.feather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-01-01 16:45
 **/
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication9411 {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication9411.class,args);
    }
}
