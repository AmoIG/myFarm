package com.amaury.MyFarm.controller;


import com.amaury.MyFarm.exception.NotFoundException;
import com.amaury.MyFarm.model.Animal;
import com.amaury.MyFarm.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/animals/")
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping("all")
    public List<Animal> getAllAnimals(){
        return this.animalRepository.findAll();
    }

    @GetMapping("{id}")
    public Animal getAnimalById(@PathVariable(value = "id") Integer id) throws NotFoundException{
        Animal animal = this.animalRepository.findById(id)
                .orElseThrow(()-> new NotFoundException());
        return animal;
    }

    @PostMapping("add")
    public Animal createAnimal(@RequestBody Animal animal){
        return this.animalRepository.save(animal);
    }

    @PutMapping("{id}")
    public Animal updateAnimal(@PathVariable(value = "id") Integer id, @RequestBody Animal animalDetails) throws NotFoundException{
        Animal animal = this.animalRepository.findById(id)
                .orElseThrow(()-> new NotFoundException());
        animal.setName(animalDetails.getName());
        animal.setSpecies(animalDetails.getSpecies());

        return this.animalRepository.save(animal);
    }

    @DeleteMapping("delete/{id}")
    public Boolean deleteAnimal(@PathVariable(value = "id") Integer id) throws NotFoundException{
        Animal animal = this.animalRepository.findById(id)
                .orElseThrow(()-> new NotFoundException());
        this.animalRepository.delete(animal);
        return true;
    }
}

