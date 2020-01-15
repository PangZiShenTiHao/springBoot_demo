package com.hxch.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:spring01.xml"})
@SpringBootApplication
public class SpringBoot01Init02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Init02Application.class, args);
    }

}
