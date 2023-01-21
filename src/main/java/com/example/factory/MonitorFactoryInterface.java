package com.example.factory;

import com.example.enums.MonitorEnum;
import com.example.monitor.MonitorInterface;

public interface MonitorFactoryInterface {

    MonitorInterface get(MonitorEnum monitorEnum);

}
