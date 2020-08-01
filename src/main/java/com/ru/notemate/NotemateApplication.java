package com.ru.notemate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NotemateApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotemateApplication.class, args);
    }

}
