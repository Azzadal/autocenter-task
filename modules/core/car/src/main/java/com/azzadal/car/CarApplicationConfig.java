package com.azzadal.car;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.azzadal.car")
@EntityScan(basePackages = "com.azzadal.car.model")
@EnableJpaRepositories(basePackages = "com.azzadal.car.repository")
public class CarApplicationConfig {
}
