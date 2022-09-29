package com.sirin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerMVSConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)//генерируй документацию для 2 версии swagger
                .select()
                .apis(RequestHandlerSelectors.any()) //для каких апи генерируется документация
                .paths(PathSelectors.any())// для каких путей генерируется документация
                .build();
    }
}
