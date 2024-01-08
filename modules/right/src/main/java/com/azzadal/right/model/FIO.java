package com.azzadal.right.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * ФИО пользователя.
 */
@Getter
@Setter
@Entity
@Table(name = "FIO")
public class FIO extends EntityIdentifier {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "sur_name")
    private String surName;
    @OneToOne(mappedBy = "FIO")
    private User user;
}
