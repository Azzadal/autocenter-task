package com.azzadal.car;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({CarApplicationConfig.class})
public class TestApp {
    @Test
    void contextLoads() {}
}
