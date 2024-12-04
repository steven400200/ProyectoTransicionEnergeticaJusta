package com.talentotech.mapping.dto;

import com.talentotech.entity.EnergySource;
import lombok.Data;

@Data
public class EnergyDataDto {
    private int id;
    private String year;
    private double production;
    private double consumption;
    private EnergySource energySource;
}
