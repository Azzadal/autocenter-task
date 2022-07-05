package com.azzadal.core.car.service;

import com.azzadal.core.car.model.TradeIn;
import com.azzadal.core.car.repository.TradeInRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TradeInService {
    private final TradeInRepository tradeInRepository;

    public TradeIn createRequest(TradeIn request) {
        return tradeInRepository.save(request);
    }
}
