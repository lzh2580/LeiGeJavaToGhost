package com.leige.design.结构型.适配器模式;

/**
 * 接口适配器模式 -- 第二步
 * - 借助中间抽象类空实现目标接口所有方法，适配器选择性重写。
 */
public class ChinaAdapter extends DefaultAdapter{
    public ChinaAdapter(Output220V output220V) {
        super(output220V);
    }

    // 适配器具体实现，可以继承父类，也可以重写
    @Override
    public int output5V() {
        System.out.println(super.output5V());
        return super.output5V();
    }
}
