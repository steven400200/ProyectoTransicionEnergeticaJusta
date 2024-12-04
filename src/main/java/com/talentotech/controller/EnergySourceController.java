package com.talentotech.controller;

import com.talentotech.entity.EnergySource;
import com.talentotech.service.EnergySourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/energySource")
public class EnergySourceController {


    @Autowired
    EnergySourceService energySourceService;

    @GetMapping("/allEnergySource")
    public ResponseEntity<List<EnergySource>> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(energySourceService.getEnergySources());
    }

}

