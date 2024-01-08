package com.azzadal.right;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EntityScan(basePackages = "com.azzadal.right.model")
@EnableJpaRepositories(basePackages = "com.azzadal.right.repository")
public class RightApplicationConfig {
}
