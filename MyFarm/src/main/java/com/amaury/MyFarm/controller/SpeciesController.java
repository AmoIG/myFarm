package com.amaury.MyFarm.controller;

import com.amaury.MyFarm.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/species")
public class SpeciesController {

    @Autowired
    SpeciesRepository speciesRepository;
}
