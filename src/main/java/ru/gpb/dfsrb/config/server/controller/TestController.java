package ru.gpb.dfsrb.config.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.dfsrb.config.server.config.ApplicationInfoConfig;
import ru.gpb.dfsrb.config.server.model.rest.ApplicationInfoConfigDTO;
import ru.gpb.dfsrb.config.server.service.CarService;
import ru.gpb.dfsrb.config.server.service.ColorProtoService;
import ru.gpb.dfsrb.config.server.service.ColorService;
import ru.gpb.dfsrb.config.server.service.ConnectionService;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final ApplicationInfoConfig applicationInfoConfig;
    private final ColorService colorService;
    private final ColorProtoService colorProtoService;
    private final CarService carService;
    private final ConnectionService connectionService;

    @GetMapping("/info")
    public ApplicationInfoConfigDTO test(){
        return new ApplicationInfoConfigDTO(applicationInfoConfig.getName(), applicationInfoConfig.getDescription());
    }

    @GetMapping("/color/name")
    public String getColorName(){
        return colorService.getName();
    }

    @GetMapping("/color/proto/name")
    public String getColorProtoName(){
        return colorProtoService.getName();
    }

    @GetMapping("/car/model")
    public String getCarModel(){
        return carService.getModel();
    }

    @GetMapping("/connection")
    public String getConnection(){
        return connectionService.getConnectionName();
    }

}
