package com.example.factory.impl;

import com.example.enums.MonitorEnum;
import com.example.factory.MonitorFactoryInterface;
import com.example.monitor.MonitorInterface;
import com.example.monitor.impl.Monitor;
import com.example.worker.processor.impl.Processor01;
import com.example.worker.processor.impl.Processor02;
import com.example.worker.reader.impl.Reader01;
import com.example.worker.reader.impl.Reader02;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MonitorFactory implements MonitorFactoryInterface {

    private final Monitor monitor1;
    private final Monitor monitor2;

    public MonitorFactory(@Qualifier("q1") Monitor monitor1,
                          @Qualifier("q2") Monitor monitor2) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
    }

    @Override
    public MonitorInterface get(MonitorEnum monitor) {

        switch (monitor) {
            case MONITOR01:
                return this.monitor1;

            case MONITOR02:
                return this.monitor2;

            default:
                return null;

        }
    };

}
