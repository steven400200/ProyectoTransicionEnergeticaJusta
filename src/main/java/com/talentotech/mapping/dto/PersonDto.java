package com.talentotech.mapping.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class PersonDto {

    @NotNull(message = "Esta campo no puede estar vacio.")
    private int id;
    @NotBlank(message = "Esta campo no puede estar vacio.")
    private String name;
    @NotBlank(message = "Esta campo no puede estar vacio.")
    private String lastName;
    private int age;
    private String phoneNumber;
    private String email;

}
