package com.leige.design.创建型.单例模式;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式其实是对外隐藏了构造函数，保证用户无法主动创建对象
 * 破坏单例的方法
 * - 反射
 * - 序列化与反序列化
 * - clone方法
 */
public class DestroySingleton {
    public static void main(String[] args) throws Exception {
        //testReflect();
        //testReflectDefend();
        testSerilize();
        //testClone();
    }

    /**
     * 问题：clone方法是不会调用构造函数的，他是直接从内存中copy内存区域的。所以单例模式的类是不可以实现cloneable接口的。
     * 解决：重写clone()方法，调clone()时直接返回已经实例的对象
     */
    private static void testClone() throws CloneNotSupportedException {
        Singleton single = Singleton.getInstance();
        Singleton single1 = (Singleton) Singleton.getInstance().clone();
        System.out.println(single == single1);
    }

    /**
     * 反序列化底层也是使用反射帮我们创建了一个新的对象。如果类有readResolve()方法，则调用
     * 单例类实现readResolve()方法,返回同一对象。
     * 单例类不实现readResolve()方法，则新建一个
     */
    private static void testSerilize() throws Exception {
        Singleton single = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(single);
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton serilizeSingle = (Singleton) ois.readObject();
        System.out.println(single);
        System.out.println(serilizeSingle);
        System.out.println(single==serilizeSingle);
    }

    /**
     * 知道单例中的属性值flag，反编译可以通过反射设置为false，所以也不是很安全
     * newInstance()方法中明确"Cannot reflectively create enum objects"
     * 不能通过反射来创建枚举类，所以枚举来构建单例模式最安全
     */
    private static void testReflectDefend() throws Exception {
        Singleton0 s1 = Singleton0.getInstance();
        Singleton0 s3 = null;
        Field flag = Singleton0.class.getDeclaredField("flag");
        flag.setAccessible(true);
        Class singleClass = Singleton0.class;
        try {
            Constructor constructor = singleClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            flag.set(s3,false);
            s3 = (Singleton0) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("s1 hashCode: "+s1.hashCode());
        System.out.println("s3 hashCode: "+s3.hashCode());
    }

    /**
     * 正常创建的单例hashCode相同
     * 反射通过constructor.setAccessible(true)屏蔽了构造方式的private的检查，可以重复调用构造方法进行创建实例
     * 解决：1。通过在构造方法种加锁，防止这种反射破坏！
     *      2。通过反射新建两个类，这两个类也不是单例。可以通过红绿灯flag标记来解决这种情况
     *      3。通过反射获取红绿灯标记，篡改为false，也可以破坏。 使用枚举构建单例模式
     */
    public static void testReflect(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = null;
        System.out.println("s1 hashCode: "+s1.hashCode());
        System.out.println("s2 hashCode: "+s2.hashCode());
        Class singleClass = Singleton.class;
        try {
            Constructor constructor = singleClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            s3 = (Singleton) constructor.newInstance();
        } catch (NoSuchMethodException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }
        System.out.println("s3 hashCode: "+s3.hashCode());
    }

}

class Singleton0{
    //定义一个flag，只允许初始化一次
    private static boolean flag = false;
    private static Singleton0 instance;
    private Singleton0() {
        if (flag == false) { flag = !flag;
        } else {
            throw new RuntimeException("单例模式被侵犯!");
        }
    }
    public static Singleton0 getInstance() {
        if (instance == null) {
            instance = new Singleton0();
        }
        return instance;
    }
}