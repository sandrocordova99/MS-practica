package com.micro.Cliente1.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@ConfigurationProperties(prefix="client1")
@Data
@Configuration
public class Cliente1Config {

    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
}
