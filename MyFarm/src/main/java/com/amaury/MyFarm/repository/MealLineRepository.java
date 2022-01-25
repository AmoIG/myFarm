package com.amaury.MyFarm.repository;

import com.amaury.MyFarm.model.MealLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealLineRepository extends JpaRepository<MealLine, Integer> {
}
