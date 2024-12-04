package com.talentotech.controller;

import com.talentotech.entity.EnergyData;
import com.talentotech.error.EnergyDataNotFoundException;
import com.talentotech.service.EnergyDataService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/energyData")
public class EnergyDataController {

    @Autowired
    EnergyDataService energyDataService;


    @GetMapping("/allEnergyData")
    public ResponseEntity<List<EnergyData>> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(energyDataService.getEnergyData());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnergyData> getUserById(@PathVariable int id ) throws EnergyDataNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(energyDataService.getEnergyDataById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnergyData> updateUser(@PathVariable int id,@RequestBody EnergyData energyData) throws EnergyDataNotFoundException {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(energyDataService.updateEnergyData(id, energyData));
    }

    @PostMapping
    public ResponseEntity<EnergyData> createUser(@RequestBody EnergyData energyData){
        return ResponseEntity.status(HttpStatus.CREATED).body(energyDataService.createEnergyData(energyData));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EnergyData> deleteUser(@PathVariable int id) throws EnergyDataNotFoundException {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(energyDataService.deleteEnergyData(id));
    }
}
