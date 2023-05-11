package io.github.simplyexample.demo.service;

import io.github.thenovaworks.spring.aws.secretsmanager.SecretsValue;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WorldBean {


    @SecretsValue("dev/aurora/apple")
    private Map<String, String> appleRdsInfo;

    @SecretsValue(value = "dev/aurora/apple", name = "dbClusterIdentifier")
    private String dbClusterIdentifier;

    public Map<String, String> getAppleRdsInfo() {
        return appleRdsInfo;
    }

    public String getDbClusterIdentifier() {
        return dbClusterIdentifier;
    }

}
