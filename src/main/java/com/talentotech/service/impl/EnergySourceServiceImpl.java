package com.talentotech.service.impl;

import com.talentotech.entity.EnergySource;
import com.talentotech.repository.EnergySourceRepository;
import com.talentotech.service.EnergySourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnergySourceServiceImpl implements EnergySourceService {

    @Autowired
    EnergySourceRepository energySourceRepository;

    @Override
    public List<EnergySource> getEnergySources() {
        return energySourceRepository.findAll();
    }
}
