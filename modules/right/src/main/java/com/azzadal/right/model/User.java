package com.azzadal.right.model;

import com.azzadal.util.model.EntityIdentifier;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Пользователь системы.
 */
@Getter
@Setter
@Entity
@Table(name = "Usr")
public class User extends EntityIdentifier {
    @Column(name = "login", nullable = false)
    private String login;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @JoinColumn(name = "fio_id")
    @OneToOne(cascade = CascadeType.ALL)
    private FIO FIO;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "telefon")
    private String telefon;
}
