package com.example.config;

import com.example.monitor.impl.Monitor;
import com.example.workers.processor.impl.Processor01;
import com.example.workers.processor.impl.Processor02;
import com.example.workers.reader.impl.Reader01;
import com.example.workers.reader.impl.Reader02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MonitorConfig {

    @Autowired
    private Reader01 reader01;

    @Autowired
    private Processor01 processor01;

    @Bean
    @Qualifier("q1")
    public Monitor configureMonitor01(){
        return new Monitor(reader01, processor01);
    }

    @Bean
    @Qualifier("q2")
    public Monitor configureMonitor02(){
        return new Monitor(new Reader02(), new Processor02());
    }

}
