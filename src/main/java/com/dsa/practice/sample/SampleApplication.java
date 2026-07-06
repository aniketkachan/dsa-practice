package com.dsa.practice.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        System.out.println("HI");
        SpringApplication.run(SampleApplication.class, args);
    }

}
