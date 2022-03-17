package com.leige.design.行为型.责任链模式;

/**
 * 责任链模式 - 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链传递请求，直到有对象处理它为止。
 * 优点： 1、降低耦合度。它将请求的发送者和接收者解耦。
 *       2、简化了对象。使得对象不需要知道链的结构。
 *       3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。
 *       4、增加新的请求处理类很方便。
 *
 * 缺点： 1、不能保证请求一定被接收。
 *       2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。
 *       3、可能不容易观察运行时的特征，有碍于除错。
 * 使用场景： 1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。
 *           2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 *           3、可动态指定一组对象处理请求。
 */
public class Test {
    public static void main(String[] args) {
        HeadMan headMan = new HeadMan();
        Manager manager = new Manager();
        President president = new President();
        // 责任链上的实施者当作参数传递
        headMan.deliverNext(manager);
        manager.deliverNext(president);
        headMan.handle(9000);
    }
}
