package com.example.factory.impl;

import com.example.domain.MonitorProcessConfig;
import com.example.enums.ConfigMonitorEnum;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class ConfigFactory {

  public MonitorProcessConfig get(ConfigMonitorEnum config) {

      if (Objects.isNull(config)) {
        return null;
      }

      switch (config) {
        case CONFIG01:
          return MonitorProcessConfig.builder().producerThreadPool(1).consumerThreadPool(1).build();

        case CONFIG02:
          return MonitorProcessConfig.builder().producerThreadPool(1).consumerThreadPool(5).build();

        case CONFIG03:
          return MonitorProcessConfig.builder().producerThreadPool(1).consumerThreadPool(15).build();

        default:
          return null;
      }

  }
}
