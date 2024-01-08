package com.azzadal.car.controller;

import com.azzadal.car.dto.object.RepairServiceRequest;
import com.azzadal.car.dto.object.RepairServiceResponse;
import com.azzadal.car.model.RepairService;
import com.azzadal.car.repository.RepairServiceRepository;
import com.azzadal.right.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/core/repair-service")
public class RepairServiceController {

    @Autowired
    private RepairServiceRepository repairServiceRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public RepairServiceResponse createRequest(@RequestBody RepairServiceRequest request) {
        RepairService repairService = new RepairService();
        repairService.setAuto(request.getAuto());
        repairService.setServiceType(request.getServiceType());
        repairService.setUser(userRepository.findById(request.getUserId()).get());

        repairService = repairServiceRepository.save(repairService);

        RepairServiceResponse repairServiceResponse = new RepairServiceResponse();
        repairServiceResponse.setAuto(repairService.getAuto());
        repairServiceResponse.setId(repairService.getId());
        repairServiceResponse.setServiceType(repairService.getServiceType());
        repairServiceResponse.setUser_id(repairService.getUser().getId());

        return repairServiceResponse;
    }
}
