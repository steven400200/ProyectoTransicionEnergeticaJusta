package com.talentotech.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String usuario;
    private String password;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
