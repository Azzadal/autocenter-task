package com.azzadal.util.mapper;

import java.util.List;

/**
 * Базовый маппер в сущность.
 *
 * @param <E> Сущность
 * @param <R> Request
 */
public interface ToEntityMapper<E, R> {
    E toEntity(R request);

    List<E> toEntity(List<R> request);
}
