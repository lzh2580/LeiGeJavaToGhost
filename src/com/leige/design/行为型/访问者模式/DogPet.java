package com.leige.design.行为型.访问者模式;

/**
 * 狗狗
 */
public class DogPet implements PetAnimal{
    @Override
    public void accept(Visitor visitor) {
        //又完成了一次动态的单分派。    方法传入this
        visitor.feeding(this);
        System.out.println("狗狗汪汪叫");
    }
}
