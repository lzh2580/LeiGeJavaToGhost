package com.leige.design.行为型.策略模式;

/**
 * 一个类里面包含一个接口，这个接口定义了不同的策略算法，
 */
public class Execute {
    public Strategy strategy;

    public Execute(Strategy strategy) {
        this.strategy = strategy;
    }
    public Execute() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        if(strategy == null){
            System.out.println("请先配置执行策略");
        }
        return strategy;
    }
    public Integer executeStrategy(int a ,int b){
        if(getStrategy() !=null){
            return strategy.operation(a,b);
        }
        return null;
    }
}
