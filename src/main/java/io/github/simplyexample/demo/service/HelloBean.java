package io.github.simplyexample.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.url}")
    private String url;

    public String getUsername() {
        return username;
    }

    public String getUrl() {
        return url;
    }

}
