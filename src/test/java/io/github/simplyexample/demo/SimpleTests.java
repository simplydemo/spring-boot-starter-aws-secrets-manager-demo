package io.github.simplyexample.demo;

import io.github.simplyexample.demo.service.HelloBean;
import io.github.simplyexample.demo.service.WorldBean;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Map;

@ActiveProfiles("local")
@SpringBootTest
class SimpleTests {

    final Logger log = LoggerFactory.getLogger(SimpleTests.class);

    @Autowired
    private HelloBean helloBean;
    @Autowired
    private WorldBean worldBean;

    @Test
    public void test_hello() {
        String username = helloBean.getUsername();
        String url = helloBean.getUrl();
        log.info("username: {}", username);
        log.info("url: {}", url);
    }

    @Test
    public void test_world() {
        Map<String, String> rdsInfo = worldBean.getAppleRdsInfo();
        log.info("rdsInfo: {}", rdsInfo);
        log.info("dbClusterIdentifier: {}", worldBean.getDbClusterIdentifier());
    }

}
