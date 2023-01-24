package com.example.config;

import com.example.monitor.impl.Monitor;
import com.example.worker.processor.impl.Processor01;
import com.example.worker.processor.impl.Processor02;
import com.example.worker.reader.impl.Reader01;
import com.example.worker.reader.impl.Reader02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MonitorConfig {

    @Autowired
    private Reader01 reader01;

    @Autowired
    private Processor01 processor01;

    @Bean
    public Monitor<Reader01, Processor01> configureMonitor01(){
        return new Monitor<Reader01, Processor01>(reader01, processor01);
    }

    @Bean
    public Monitor<Reader02, Processor02> configureMonitor02(){
        return new Monitor<Reader02, Processor02>(new Reader02(), new Processor02());
    }

}
