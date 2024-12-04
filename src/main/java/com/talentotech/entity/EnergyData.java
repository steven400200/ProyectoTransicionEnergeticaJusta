package com.talentotech.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "energydata")
public class EnergyData {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String year;
    private double production;
    private double consumption;
    @ManyToOne
    @JoinColumn(name = "source_id")
    private EnergySource energySource;


    public boolean isEmpty() {
        return id == 0 &&
                (year == null || year.isEmpty()) &&
                production == 0 &&
                consumption == 0 &&
                energySource == null;
    }
}
