package com.leige.design.行为型.责任链模式;

/**
 * President
 */
public class President implements ApproveHandler {
    private ApproveHandler next;

    @Override
    public void deliverNext(ApproveHandler next) {
        this.next = next;
    }

    @Override
    public boolean handle(int money) {
        if(money<5000){
            System.out.println("小钱，批了！");
            return true;
        }
        if(next == null){
            System.out.println(String.format("%d超出预算,退回缩减预算吧",money));
        }else{
            next.handle(money);
        }
        return false;
    }
}
