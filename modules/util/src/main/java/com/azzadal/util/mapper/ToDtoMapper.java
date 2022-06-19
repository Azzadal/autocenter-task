package com.azzadal.util.mapper;

import java.util.List;

/**
 * Базовый маппер в dto.
 * @param <E> Сущность
 * @param <R> Dto
 */
public interface ToDtoMapper<E, R> {
    R toDto(E entity);

    List<R> toDto(List<E> entities);
}
