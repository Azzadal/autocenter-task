package com.azzadal.car.service;

import com.azzadal.car.dto.mapper.TestDriveRequestMapper;
import com.azzadal.car.dto.object.TestDriveRequest;
import com.azzadal.car.model.TestDrive;
import com.azzadal.car.repository.TestDriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TestDriveService {
    private final TestDriveRepository testDriveRepository;
    private final TestDriveRequestMapper testDriveRequestMapper;

    public TestDrive create(TestDriveRequest request) {
        return testDriveRepository.save(testDriveRequestMapper.toEntity(request));
    }
}
