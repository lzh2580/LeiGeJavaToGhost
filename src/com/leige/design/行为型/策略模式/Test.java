package com.leige.design.行为型.策略模式;

/**
 * 策略模式 - 定义算法簇,分别封装起来, 让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。
 * 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 */
public class Test {
    public static void main(String[] args) {
        Execute e = new Execute();
        e.getStrategy();
        System.out.println(e.executeStrategy(1,2));
        e.setStrategy(new AddStrategy());
        System.out.println(e.executeStrategy(1,2));
        e.setStrategy(new DeleteStrategy());
        System.out.println(e.executeStrategy(1,2));
    }
    /**
     * 状态模式是策略模式的孪生兄弟，是因为它们的UML图是一样的。
     * - 状态模式重点在各状态之间的切换，从而做不同的事情；而策略模式更侧重于根据具体情况选择策略，并不涉及切换。
     * - 状态模式不同状态下做的事情不同，而策略模式做的都是同一件事，只不过策略算法不同
     * - 状态模式封装了对象的状态，而策略模式封装算法。状态是跟对象密切相关的，不能被重用；
     *   策略模式通过从Context中分离出策略或算法，我们可以重用它们。
     * - 在状态模式中，每个状态通过持有Context的引用，来实现状态转移；但是每个策略都不持有Context的引用，它们只是被Context使用。
     * - 状态模式将各个状态所对应的操作分离开来，即对于不同的状态，由不同的子类实现具体操作，不同状态的切换由子类实现，
     *   当发现传入参数不是自己这个状态所对应的参数，则自己给Context类切换状态；这种转换是"自动"，"无意识"的。
     *   状态模式允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
     *   而策略模式是直接依赖注入到Context类的参数进行策略选择，不存在切换状态的操作。
     */
}
