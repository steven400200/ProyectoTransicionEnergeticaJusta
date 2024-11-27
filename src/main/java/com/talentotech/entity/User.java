package com.talentotech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    private int id;
    private String usuario;
    private String password;
    @ManyToOne
    private Person person;
}
