package com.leige.design.结构型.适配器模式;

/**
 * 对象适配器 - 持有原对象的引用
 * 把继承关系改变为组合关系。
 */
public class ObjectAdapter implements Output5V{

    private Output220V requireAdapter;

    public ObjectAdapter(Output220V requireAdapter) {
        this.requireAdapter = requireAdapter;
    }

    @Override
    public int output5V() {
        int i = requireAdapter.output220();
        int convert = i/44;
        System.out.println("对象适配器转换电压，转换前为"+i+"V,转换后为"+convert+"V");
        return convert;
    }
}
