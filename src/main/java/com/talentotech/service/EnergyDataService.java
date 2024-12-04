package com.talentotech.service;

import com.talentotech.entity.EnergyData;
import com.talentotech.error.EnergyDataNotFoundException;

import java.util.List;
import java.util.Optional;

public interface EnergyDataService {

    List<EnergyData> getEnergyData();

    EnergyData getEnergyDataById(int id ) throws EnergyDataNotFoundException;

    EnergyData updateEnergyData(int id, EnergyData energyData) throws EnergyDataNotFoundException;

    EnergyData createEnergyData(EnergyData energyData);

    EnergyData deleteEnergyData(int id) throws EnergyDataNotFoundException;
}
