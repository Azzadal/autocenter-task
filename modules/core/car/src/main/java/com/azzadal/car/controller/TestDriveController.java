package com.azzadal.car.controller;

import com.azzadal.car.dto.object.TestDriveRequest;
import com.azzadal.car.model.TestDrive;
import com.azzadal.car.service.TestDriveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/core/test-drive")
@RequiredArgsConstructor
public class TestDriveController {

    private final TestDriveService testDriveService;

    @PostMapping
    public TestDrive createRequest(@RequestBody TestDriveRequest request) {
        return testDriveService.create(request);
    }
}
