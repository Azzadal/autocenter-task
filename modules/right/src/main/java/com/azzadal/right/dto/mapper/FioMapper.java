package com.azzadal.right.dto.mapper;

import com.azzadal.right.dto.object.FioDto;
import com.azzadal.right.model.FIO;
import com.azzadal.util.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper
public interface FioMapper extends BaseMapper<FIO, FioDto> {
    FioDto toDto(FIO entity);
    FIO toEntity(FioDto dto);
}
