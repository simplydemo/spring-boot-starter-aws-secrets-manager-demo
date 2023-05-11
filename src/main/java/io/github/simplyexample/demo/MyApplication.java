package io.github.simplyexample.demo;

import io.github.simplyexample.demo.service.HelloBean;
import io.github.simplyexample.demo.service.WorldBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Configuration
    class MyConfiguration {

        @Bean
        String hello(HelloBean helloBean) {
            System.out.println("helloBean: " + helloBean);
            System.out.println("username: " + helloBean.getUsername());
            System.out.println("url: " + helloBean.getUrl());
            return "hello ^^";
        }

        @Bean
        String world(WorldBean worldBean) {
            System.out.println("worldBean: " + worldBean);
            System.out.println("appleRdsInfo: " + worldBean.getAppleRdsInfo());
            System.out.println("dbClusterIdentifier: " + worldBean.getDbClusterIdentifier());
            return "world ^^";
        }
    }

}
