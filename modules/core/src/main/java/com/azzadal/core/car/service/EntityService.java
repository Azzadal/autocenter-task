package com.azzadal.core.car.service;

import java.util.List;

/**
 * Базовый интерфейс сервиса для работы с сущностями.
 * @param <T> Response
 * @param <R> Request
 */
public interface EntityService<T, R> {
    T getById(Long id);

    List<T> getAll();

    T create(R request);

    T update(Long id, R request);

    void delete(Long id);
}
