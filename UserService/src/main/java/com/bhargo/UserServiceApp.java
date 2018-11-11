package com.bhargo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by bhargo on 13/9/18.
 */
@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
//@EnableConfigurationProperties
public class UserServiceApp implements
        CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ran from docker image successfully");

    }
}
