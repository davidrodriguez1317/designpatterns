package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.concreteclasses.ChickenBurger;
import com.designpatterns.creational.builder.concreteclasses.Coke;
import com.designpatterns.creational.builder.concreteclasses.Pepsi;
import com.designpatterns.creational.builder.concreteclasses.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
