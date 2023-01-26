package com.example.config;

import com.example.monitor.impl.Monitor;
import com.example.workers.consumer.impl.Consumer01;
import com.example.workers.producer.impl.Producer01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MonitorConfig {

    @Autowired private Producer01 producer01;

    @Autowired private Consumer01 consumer01;

    @Bean
    @Qualifier("monitor01")
    public Monitor configureMonitor01V2(){
        return new Monitor(this.producer01, this.consumer01);
    }

}
