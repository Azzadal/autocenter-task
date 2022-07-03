package com.azzadal.core.car.dto.mapper;

import com.azzadal.core.car.dto.object.TestDriveRequest;
import com.azzadal.core.car.model.TestDrive;
import com.azzadal.util.mapper.ToEntityMapper;
import org.mapstruct.Mapper;

@Mapper
public interface TestDriveRequestMapper extends ToEntityMapper<TestDrive, TestDriveRequest> {
}
