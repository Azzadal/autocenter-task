package com.azzadal.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(com.azzadal.auth.AuthConfigApplication.class)
public class MainConfigApplication {
    @Bean
    public Logger logger(){
        return LoggerFactory.getLogger("application");
    }
}
