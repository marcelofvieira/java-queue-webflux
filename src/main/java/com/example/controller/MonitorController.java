package com.example.controller;

import com.example.enums.MonitorEnum;
import com.example.factory.impl.MonitorFactory;
import com.example.monitor.MonitorInterface;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/monitors")
public class MonitorController {

    private final MonitorFactory monitorFactory;

    public MonitorController(MonitorFactory monitorFactory) {
        this.monitorFactory = monitorFactory;
    }

    @PostMapping("/{name}/{config}")
    public Mono<String> executeMonitor(@PathVariable("name") String monitorName,
                                       @PathVariable("config") String monitorConfig) {

        MonitorInterface monitor = monitorFactory.get(MonitorEnum.getByName(monitorName));

        monitor.execute(monitorConfig);

        return Mono.just("Finished");
    };


}
