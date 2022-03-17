package com.leige.design.行为型.访问者模式;

/**
 * 外人访问
 */
public class Stranger implements Visitor{

    @Override
    public void feeding(CatPet cat) {
        System.out.println("陌生人喂猫");
    }

    @Override
    public void feeding(DogPet dog) {
        System.out.println("陌生人喂狗");
    }

//    @Override
//    public void feeding(PetAnimal pet) {
//        if(pet instanceof CatPet){
//            System.out.println("陌生人喂猫----");
//        }else{
//            System.out.println("陌生人喂狗====");
//        }
//    }
}
