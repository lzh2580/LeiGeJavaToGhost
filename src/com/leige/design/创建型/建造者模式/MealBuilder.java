package com.leige.design.创建型.建造者模式;

/**
 * 生产不同种类的工厂 --  素食 + 肉食
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Milk());
        return meal;
    }
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new BlackTea());
        return meal;
    }
}
