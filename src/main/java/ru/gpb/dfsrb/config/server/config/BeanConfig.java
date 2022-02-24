package ru.gpb.dfsrb.config.server.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gpb.dfsrb.config.server.service.*;
import ru.gpb.dfsrb.config.server.service.impl.SimpleCarConnectionService;
import ru.gpb.dfsrb.config.server.service.impl.SimpleColorConnectionService;

/**
 * Данный конфиг не будет работать, тк. RefreshScope не может перезагрузить контекст приложения
 * тем самым подменив реализацию бина ConnectionService
 */
@Configuration
@RequiredArgsConstructor
@RefreshScope
public class BeanConfig {

    private final ColorService colorService;
    private final CarService carService;

    @Bean
    @ConditionalOnProperty(value = "app.connection.service.simple.color", havingValue = "true", matchIfMissing = false)
    @RefreshScope
    public ConnectionService simpleColorConnectionService(){
        return new SimpleColorConnectionService(colorService);
    }

    @Bean
    @ConditionalOnProperty(value = "app.connection.service.simple.car", havingValue = "true", matchIfMissing = false)
    @RefreshScope
    public ConnectionService simpleCarConnectionService(){
        return new SimpleCarConnectionService(carService);
    }
}
