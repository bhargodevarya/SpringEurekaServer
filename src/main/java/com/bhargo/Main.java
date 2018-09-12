package com.bhargo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by bhargo on 12/9/18.
 */
@SpringBootApplication
@EnableEurekaServer
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
