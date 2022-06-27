package com.azzadal.core;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EntityScan(basePackages = "com.azzadal.core.car.model")
public class CoreApplicationConfig {
}
