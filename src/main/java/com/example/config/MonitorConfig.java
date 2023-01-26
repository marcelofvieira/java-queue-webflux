package com.example.config;

import com.example.monitor.impl.Monitor;
import com.example.workers.consumer.impl.Consumer01;
import com.example.workers.consumer.impl.Consumer02;
import com.example.workers.producer.impl.Producer01;
import com.example.workers.producer.impl.Producer02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MonitorConfig {

    @Autowired private Producer01 producer01;

    @Autowired private Consumer01 consumer01;

    @Autowired private Producer02 producer02;

    @Autowired private Consumer02 consumer02;

    @Bean
    @Primary
    @Qualifier("monitor01")
    public Monitor configureMonitor01(){
        return new Monitor(this.producer01, this.consumer01);
    }

    @Bean
    @Qualifier("monitor02")
    public Monitor configureMonitor02(){
        return new Monitor(this.producer02, this.consumer02);
    }

}
