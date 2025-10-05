package com.util.general_manager.infra.config;

import com.util.general_manager.shared.LogAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfiguration {

    @Bean
    public LogAdapter logAdapter() {
        return new LogAdapter();
    }
}
