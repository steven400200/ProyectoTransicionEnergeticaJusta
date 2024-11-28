package com.talentotech.mapping.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {

    @NotBlank(message = "Esta campo no puede estar vacio.")
    private int id;
    @NotBlank(message = "Esta campo no puede estar vacio.")
    private String usuario;

}
