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
    private final Monitor monitor2;

    public MonitorFactory(@Qualifier("monitor01") Monitor monitor1,
                          @Qualifier("monitor02") Monitor monitor2) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
    }

    @Override
    public MonitorInterface get(MonitorEnum monitor) {

        switch (monitor) {
            case MONITOR01:
                this.monitor1.setMonitorName(monitor.getValue());
                return this.monitor1;

            case MONITOR02:
                this.monitor2.setMonitorName(monitor.getValue());
                return this.monitor2;

            default:
                return null;

        }



    };

}
