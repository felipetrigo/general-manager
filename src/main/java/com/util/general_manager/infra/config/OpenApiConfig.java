package com.util.general_manager.infra.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI generalManagerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("General Manager API")
                        .description("API for managing forms and scores")
                        .version("1.0")
                        .contact(new Contact()
                                .name("General Manager Team")
                                .email("contact@generalmanager.com")));
    }
}
