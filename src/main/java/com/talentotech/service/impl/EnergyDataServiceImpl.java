package com.talentotech.service.impl;

import com.talentotech.entity.EnergyData;
import com.talentotech.error.EnergyDataNotFoundException;
import com.talentotech.repository.EnergyDataRepository;
import com.talentotech.service.EnergyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EnergyDataServiceImpl implements EnergyDataService {

    @Autowired
    EnergyDataRepository energyDataRepository;

    @Override
    public List<EnergyData> getEnergyData() {
        return energyDataRepository.findAll();
    }

    @Override
    public EnergyData getEnergyDataById(int id) throws EnergyDataNotFoundException {
        Optional<EnergyData> aux = energyDataRepository.findById(id);
        if (!aux.isPresent()) {
            throw new EnergyDataNotFoundException("User is not available");
        }
        return aux.get();
    }

    @Override
    public EnergyData updateEnergyData(int id, EnergyData energyData) throws EnergyDataNotFoundException {
        EnergyData aux = energyDataRepository.findById(id).get();
        if (aux.isEmpty()) {
            throw new EnergyDataNotFoundException("User is not available");
        } else {
            if (!energyData.getYear().isBlank()) {
                aux.setYear(energyData.getYear());
            }
            if (energyData.getProduction() != 0) {
                aux.setProduction(energyData.getProduction());
            }
            if (energyData.getConsumption() != 0) {
                aux.setConsumption(energyData.getConsumption());

                energyDataRepository.save(aux);
            }
            return aux;
        }
    }

    @Override
    public EnergyData createEnergyData(EnergyData energyData) {
        return energyDataRepository.save(energyData);
    }

    @Override
    public EnergyData deleteEnergyData(int id) throws EnergyDataNotFoundException {
        EnergyData energyData = energyDataRepository.findById(id).get();
        if (energyData.isEmpty()) {
            throw new EnergyDataNotFoundException("User is not available");
        }
        energyDataRepository.deleteById(id);
        return energyData;
    }

}
