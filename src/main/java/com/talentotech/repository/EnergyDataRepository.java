package com.talentotech.repository;

import com.talentotech.entity.EnergyData;
import com.talentotech.entity.EnergySource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnergyDataRepository extends JpaRepository<EnergyData,Integer> {
}
