package ru.gpb.dfsrb.config.server.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "app.car")
@Setter
@Getter
@RefreshScope
public class CarService {

    private String model;
}
