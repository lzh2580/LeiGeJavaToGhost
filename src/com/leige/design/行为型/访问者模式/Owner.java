package com.leige.design.行为型.访问者模式;

/**
 * 主人访问
 */
public class Owner implements Visitor{

    @Override
    public void feeding(CatPet cat) {
        System.out.println("主人喂猫");
    }

    @Override
    public void feeding(DogPet dog) {
        System.out.println("主人喂狗");
    }

//    @Override
//    public void feeding(PetAnimal pet) {
//        if(pet instanceof CatPet){
//            System.out.println("主人喂猫----");
//        }else{
//            System.out.println("主人喂狗====");
//        }
//    }
}
