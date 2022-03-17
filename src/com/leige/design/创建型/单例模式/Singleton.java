package com.leige.design.创建型.单例模式;

import java.io.Serializable;

/**
 * 懒汉，线程不安全
 */
public class Singleton implements Serializable,Cloneable {
    private static Singleton instance;
    private Singleton (){}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    private Object readResolve() {
        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;  //super.clone();
    }
}
/**
 * 懒汉，线程安全  + synchronized
 */
 class Singleton1 {
    private static Singleton1 instance;
    private Singleton1 (){}
    public static synchronized Singleton1
    getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

/**
 * 饿汉，初始化直接赋值
 */
class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3 (){}
    public static Singleton3 getInstance() {
        return instance;
    }
}

/**
 * 饿汉，static代码块中初始化
 */
 class Singleton4 {
    private static Singleton4 instance = null;
    static {
        instance = new Singleton4();
    }
    private Singleton4 (){}
    public static Singleton4 getInstance() {
        return instance;
    }
}

/**
 * 静态内部类
 * Singleton类被装载了，instance不一定被初始化
 * 类只能同时被1个线程初始化，且在同一个加载器中，同一个类不会第二次初始化。
 * 所以饿汉模式和静态内部类模式都没有线程安全问题
 */
 class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE
                = new Singleton5();
    }
    private Singleton5 (){}
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/**
 * 枚举
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，
 * 它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒
 */
 enum Singleton6 {
    INSTANCE;
    public void whateverMethod() {
    }
}

/**
 * 双重校验锁
 * 1分配内存空间
 * 2初始化对象
 * 3实例指向内存空间此时instance ！= null
 */
 class Singleton7 {
     // 指令重排风险，所以要加volatile。第一次检测，不为null，instance初始化没有完成，但是已经有内存空间了
    private volatile static Singleton7 singleton;
    private Singleton7 (){}
    public static Singleton7 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton7.class) {
                if (singleton == null) {
                    singleton = new Singleton7();
                }
            }
        }
        return singleton;
    }
}

