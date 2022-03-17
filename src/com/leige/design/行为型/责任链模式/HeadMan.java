package com.leige.design.行为型.责任链模式;

import java.util.Objects;

/**
 * HeadMan
 */
public class HeadMan implements ApproveHandler{
    private ApproveHandler next;
    @Override
    public void deliverNext(ApproveHandler next) {
        this.next = next;
    }

    @Override
    public boolean handle(int money) {
        if(money<1000){
            System.out.println("小钱，批了！");
            return true;
        }
        Objects.requireNonNull(next);
        System.out.println(String.format("%d超出HeadMan权限,请更高级管理层批复",money));
        return next.handle(money);
    }
}
