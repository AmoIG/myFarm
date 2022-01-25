package com.amaury.MyFarm.model;

import javax.persistence.*;

@Entity
@Table(name = "mealLine")
public class MealLine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "meal", referencedColumnName = "id")
    @ManyToOne
    private Meal meal;

    @JoinColumn(name = "food", referencedColumnName = "id")
    @ManyToOne
    private Food food;

    @Column(name = "quantity")
    private Integer quantity;

    public MealLine() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
