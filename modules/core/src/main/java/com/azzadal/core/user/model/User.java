package com.azzadal.core.user.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Пользователь системы.
 */
@Getter
@Setter
@Entity
@Table(name = "Usr")
public class User extends EntityIdentifier {
    private String login;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "FIO")
    private String FIO;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "telefon")
    private String telefon;
}
