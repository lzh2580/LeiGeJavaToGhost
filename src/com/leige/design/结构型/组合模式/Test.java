package com.leige.design.结构型.组合模式;

/**
 * 组合模式 - 将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 优点： 1、高层模块调用简单。 2、节点自由增加。
 * 缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 * 使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
 */
public class Test {
    /**
     * 菜单 - 家常菜，凉菜，汤类
     * @param args
     */
    public static void main(String[] args) {
        MenuItem item = new MenuItem("家常菜","好吃便宜",false,0);
        MenuItem item1 = new MenuItem("凉菜","清爽可口",true,0);
        MenuItem item2 = new MenuItem("汤类","回味无穷",false,0);
        MenuItem hsr = new MenuItem("红烧肉", "好吃美味，价格实惠", Boolean.FALSE, 36.0);
        MenuItem ssbc = new MenuItem("手撕包菜", "好吃美味，价格实惠", Boolean.TRUE, 18.0);
        MenuItem lbhg = new MenuItem("凉拌黄瓜", "好吃美味，价格实惠", Boolean.TRUE, 12.0);
        MenuItem zcdt = new MenuItem("紫菜蛋汤", "好吃美味，价格实惠", Boolean.TRUE, 3.0);
        item.add(hsr);
        item.add(ssbc);
        item1.add(lbhg);
        item2.add(zcdt);
        item.add(item1);
        item.add(item2);
        System.out.println(item.toString());
    }
}
