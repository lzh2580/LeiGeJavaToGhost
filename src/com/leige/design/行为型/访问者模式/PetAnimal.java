package com.leige.design.行为型.访问者模式;

/**
 * 宠物接口 - 被访问者
 * 想访问被访问者的方法 - 必须传参访问者接口
 */
public interface PetAnimal {
    void accept(Visitor visitor);
}
