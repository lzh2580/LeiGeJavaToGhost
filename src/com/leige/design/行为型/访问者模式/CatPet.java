package com.leige.design.行为型.访问者模式;

/**
 * 猫咪
 */
public class CatPet implements PetAnimal{
    @Override
    public void accept(Visitor visitor) {
        //又完成了一次动态的单分派。根据visitor调用feeding方法，方法传入this。
        visitor.feeding(this);    // this很关键
        System.out.println("猫咪喵喵叫");
    }
}
