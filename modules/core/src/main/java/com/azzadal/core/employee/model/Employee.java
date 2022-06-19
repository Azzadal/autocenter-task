package com.azzadal.core.employee.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сотрудник.
 */
@Getter
@Setter
@Entity
@Table(name = "Employee")
public class Employee extends EntityIdentifier {
    @Column(name = "FIO")
    private String FIO;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "salary")
    private Double salary;
}
