package com.leige.design.行为型.迭代器模式;

/**
 * MyIterable
 */
public interface MyIterable<T> {
    MyIterator<T> iterator();
}
