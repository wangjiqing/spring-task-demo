package com.baidu.depth.springtaskdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringTaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTaskDemoApplication.class, args);
    }
}
