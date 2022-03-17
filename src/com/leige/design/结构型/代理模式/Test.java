package com.leige.design.结构型.代理模式;

import com.leige.design.结构型.装饰者模式.Child;
import com.leige.design.结构型.装饰者模式.ChildWrapper;

/**
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问。
 * 优点： 1、职责清晰。 2、高扩展性。 3、智能化。
 * 缺点： 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 *       2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 * 使用场景：jdk动态代理 implements  InvocationHandler，重写invoke方法
 *
 */
public class Test {
    /**
     * 代理模式与装饰模式区别：
     * 代理模式，注重对对象某一功能的流程把控和辅助。它可以控制对象做某些事，重心是为了借用对象的功能完成某一流程，而非对象功能如何。
     * 装饰模式，注重对对象功能的扩展，它不关心外界如何调用，只注重对对象功能的加强，装饰后还是对象本身。可以递归装饰(纵向)，代理横向
     * 对于代理类，如何调用对象的某一功能是思考重点，而不需要兼顾对象的所有功能；
     * 对于装饰类，如何扩展对象的某一功能是思考重点，同时也需要兼顾对象的其它功能，
     * 因为再怎么装饰，本质也是对象本身，要担负起对象应有的职责。
     */
    /**
     * 孩子有吃饭和学习两件任务，父母作为代理类之一，只能指导吃饭；学校作为代理类之一，只能指导学习。
     * 对于某些独立自主的孩子（装饰类），学习更加主动，吃完饭会主动收拾碗筷，原有功能的加强，
     * 它的本质仍然是孩子，依然可以享受父母、学校的代理帮助。
     */
    public static void main(String[] args) {
        Child child = new Child();
        ChildWrapper wrapper = new ChildWrapper(child);
        Parent parent = new Parent(child);
        School school = new School();
        parent.eat();
        school.addStudent(child);
        school.study();
        wrapper.eat();
    }
}
