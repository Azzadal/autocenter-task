package com.azzadal.car.model;

import com.azzadal.right.model.User;
import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Заявки на trade-in.
 */
@Getter
@Setter
@Entity
@Table(name = "Trade_in_request")
public class TradeIn extends EntityIdentifier {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String connection;
}
