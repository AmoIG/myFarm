package com.amaury.MyFarm.controller;

import com.amaury.MyFarm.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meals")
public class MealController {

    @Autowired
    MealRepository mealRepository;
}
