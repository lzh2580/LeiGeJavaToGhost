package com.leige.design.行为型.访问者模式;

/**
 * 访问者接口 - 方法重载，每个方法传入不同的被访问者
 * 静态与动态并存，优先访问静态
 */
public interface Visitor {
    /**
     * Java静态绑定 - 方法重载
     */
    void feeding(CatPet cat);
    void feeding(DogPet dog);
    /**
     * Java伪动态绑定 - 传入接口或者父类，通过 instanceof 来判断类型
     */
    //void feeding(PetAnimal pet);

}
