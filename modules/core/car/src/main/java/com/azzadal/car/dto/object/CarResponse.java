package com.azzadal.car.dto.object;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class CarResponse {
    private Long id;

    private Mark mark;

    private Model model;

    private String color;

    private String status;

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
