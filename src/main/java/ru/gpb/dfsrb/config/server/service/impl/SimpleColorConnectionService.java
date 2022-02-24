package ru.gpb.dfsrb.config.server.service.impl;

import lombok.RequiredArgsConstructor;
import ru.gpb.dfsrb.config.server.service.ColorService;
import ru.gpb.dfsrb.config.server.service.ConnectionService;

@RequiredArgsConstructor
public class SimpleColorConnectionService implements ConnectionService {

    private final ColorService colorService;

    @Override
    public String getConnectionName() {
        return "SimpleColorConnectionService: " + colorService.getName();
    }
}
