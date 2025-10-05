package com.util.general_manager.infra.config;

import com.util.general_manager.domain.mapper.FormMapper;
import com.util.general_manager.domain.port.output.SaveFormOutputPort;
import com.util.general_manager.domain.usecase.saveform.SaveFormUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SaveFormUsecaseConfig {

    private final SaveFormOutputPort port;
    private final FormMapper mapper;
    @Bean
    public SaveFormUsecase saveFormUsecase(){
        return new SaveFormUsecase(port,mapper);
    }
}
