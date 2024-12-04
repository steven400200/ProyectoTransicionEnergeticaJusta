package com.talentotech.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "energysource")
public class EnergySource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;



}
