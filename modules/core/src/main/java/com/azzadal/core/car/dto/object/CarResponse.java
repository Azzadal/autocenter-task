package com.azzadal.core.car.dto.object;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class CarResponse {
    Long id;

    Mark mark;

    Model model;

    String color;

    String status;

    @Data
    @RequiredArgsConstructor
    public static class Mark {
        private String name;
    }

    @Data
    @RequiredArgsConstructor
    public static class Model {
        private String name;
    }
}
