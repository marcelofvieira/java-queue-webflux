package com.example.factory.impl;

import com.example.enums.MonitorEnum;
import com.example.factory.MonitorFactoryInterface;
import com.example.monitor.MonitorInterface;
import com.example.monitor.impl.Monitor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MonitorFactory implements MonitorFactoryInterface {

    private final Monitor monitor1;

    public MonitorFactory(@Qualifier("monitor01") Monitor monitor1) {
        this.monitor1 = monitor1;
    }

    @Override
    public MonitorInterface get(MonitorEnum monitor) {

        switch (monitor) {
            case MONITOR01:
                this.monitor1.setMonitorName(monitor.getValue());
                return this.monitor1;

            default:
                return null;

        }
    };

}
