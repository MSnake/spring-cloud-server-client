package ru.gpb.dfsrb.config.server.service.impl;

import lombok.RequiredArgsConstructor;
import ru.gpb.dfsrb.config.server.service.CarService;
import ru.gpb.dfsrb.config.server.service.ConnectionService;

@RequiredArgsConstructor
public class SimpleCarConnectionService implements ConnectionService {

    private final CarService carService;

    @Override
    public String getConnectionName() {
        return "SimpleCarConnectionService: " + carService.getModel();
    }
}
