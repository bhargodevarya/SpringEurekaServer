package com.bhargo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by bhargo on 16/9/18.
 */
@SpringBootApplication(exclude = GsonAutoConfiguration.class)
@EnableZuulProxy
//@EnableDiscoveryClient
@EnableEurekaClient
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
