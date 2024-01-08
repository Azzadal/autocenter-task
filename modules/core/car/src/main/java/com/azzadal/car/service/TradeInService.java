package com.azzadal.car.service;

import com.azzadal.car.dto.object.TradeInRequest;
import com.azzadal.car.model.TradeIn;
import com.azzadal.car.repository.TradeInRepository;
import com.azzadal.right.model.User;
import com.azzadal.right.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TradeInService {

    private final Logger logger = LoggerFactory.getLogger(TradeInService.class);
    private final TradeInRepository tradeInRepository;
    private final UserRepository userRepository;

    public TradeIn createRequest(TradeInRequest request) {
        User user = userRepository.findById(request.getUserId()).orElseThrow(() -> new RuntimeException("Пользователь не найден"));
        logger.info("Заявка принята");
        TradeIn tradeIn = new TradeIn();
        tradeIn.setUser(user);
        tradeIn.setConnection(request.getConnection());
        return tradeInRepository.save(tradeIn);
    }
}
