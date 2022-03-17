package com.leige.design.行为型.责任链模式;

/**
 * ApproveHandler
 */
public interface ApproveHandler {
    void deliverNext(ApproveHandler next);
    boolean handle(int money);
}
