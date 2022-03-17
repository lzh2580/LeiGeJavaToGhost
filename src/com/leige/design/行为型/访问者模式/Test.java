package com.leige.design.行为型.访问者模式;

/**
 * 访问者模式 - 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作。
 * 优点： 1、符合单一职责原则。 2、优秀的扩展性。 3、灵活性。
 * 缺点： 1、具体元素对访问者公布细节，违反了迪米特原则。
 *       2、具体元素变更比较困难。
 *       3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
 */
public class Test {
    /**
     * 伪动态双分派 - 先确定调用哪个Pet的accept()方法,
     *               再确定调用Visitor中的针对哪个Pet的visit()方法
     *
     * Java支持单分派，不支持多分派。如果某一种编程语言支持双分派，也就不需要访问者模式了
     * 单分派 - 哪个对象/运行时，哪个方法/编译期 调用哪个对象(多态)的方法，在运行期确定，调用对象的哪个方法，在编译期确定。
     * 双分派 - 哪个对象/运行时，哪个方法/运行时 调用哪个对象的方法，在运行期（多态）确定；调用对象的哪个方法（方法重载），在运行期确定。
     */
    public static void main(String[] args) {
        PetHome home = new PetHome();
        PetAnimal dog1 = new DogPet();
        PetAnimal dog2 = new DogPet();
        PetAnimal cat = new CatPet();
        home.add(dog1);
        home.add(dog2);
        home.add(cat);
        Visitor v = new Stranger();
        Visitor owner = new Owner();
        home.accept(v);
    }
}
