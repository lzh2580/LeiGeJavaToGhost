package com.leige.design.行为型.访问者模式.testJava;

/**
 * Java支持单分派，不支持多分派。
 * call方法中，到底调用Parent的call还是会调用Child的call，由创建的对象实例类型决定，是运行时决定的，正所谓运行时多态
 * 调用哪个saveName重载，在编译时就由传参类型决定
 */
public class TestJava {
    public static void main(String[] args) {
        TestJava test = new TestJava();
        Parent c = new Child();
        test.call(c);
        // 方法重载，静态绑定
        test.sayName(c);
    }
    public void call(Parent parent) {
        //运行时确定
        parent.call();
    }

    public  void sayName(Parent parent) {
        System.out.println("saveName重载，参数类型： Parent");
    }

    public  void sayName(Child child) {
        System.out.println("saveName重载，参数类型： Child");
    }
}
