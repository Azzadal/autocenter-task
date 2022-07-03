package com.azzadal.core.car.controller;

import com.azzadal.core.car.dto.object.TestDriveRequest;
import com.azzadal.core.car.model.TestDrive;
import com.azzadal.core.car.service.TestDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/core/test-drive")
public class TestDriveController {
    @Autowired
    private TestDriveService testDriveService;

    @PostMapping
    public TestDrive createRequest(TestDriveRequest request) {
        return testDriveService.create(request);
    }
}
