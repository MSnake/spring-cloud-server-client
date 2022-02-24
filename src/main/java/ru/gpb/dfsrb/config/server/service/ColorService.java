package ru.gpb.dfsrb.config.server.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@Setter
@Getter
@RefreshScope
public class ColorService {

    private String name;

    public ColorService(@Value("${app.color.name}") String name) {
        this.name = name;
    }
}
