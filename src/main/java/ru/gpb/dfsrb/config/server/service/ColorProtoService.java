package ru.gpb.dfsrb.config.server.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Setter
@Getter
@RefreshScope
public class ColorProtoService {

    private String name;

    public ColorProtoService(@Value("${app.color.proto.name}") String name) {
        this.name = name;
    }
}
