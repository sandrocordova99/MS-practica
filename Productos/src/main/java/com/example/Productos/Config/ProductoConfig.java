package com.example.Productos.Config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@ConfigurationProperties(prefix = "productos")
@Data
@Configuration
public class ProductoConfig {
    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
}
