package ru.gpb.dfsrb.config.server.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app.info")
@Getter
@Setter
@Configuration
@RefreshScope
public class ApplicationInfoConfig {

    public String name;
    public String description;
}
