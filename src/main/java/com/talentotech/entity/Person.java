package com.talentotech.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Data
@Entity
public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;
    @OneToMany(mappedBy = "person")
    private List<User> users ;



}
