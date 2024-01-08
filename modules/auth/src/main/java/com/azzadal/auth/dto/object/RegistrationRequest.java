package com.azzadal.auth.dto.object;

import com.azzadal.right.dto.object.FioDto;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
public class RegistrationRequest {
    @NotEmpty
    private String login;
    @NotEmpty
    private String password;
    private FioDto fio;
    private LocalDate birthday;
    private String email;
    private String address;
    private String telefon;
}
