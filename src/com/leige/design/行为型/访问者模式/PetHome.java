package com.leige.design.行为型.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 宠物家园 - 可以集中管理所有宠物
 */
public class PetHome implements PetAnimal{
    protected List<PetAnimal> pets = new ArrayList();
    public void add(PetAnimal pet){
        pets.add(pet);
    }
    @Override
    public void accept(Visitor visitor) {
        //完成了一次动态单分派，指向cat还是dog对象
        pets.forEach(c -> c.accept(visitor));
    }
}
