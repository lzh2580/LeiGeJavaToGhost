package com.leige.design.结构型.组合模式;

/**
 * Component
 */
public interface Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
    boolean hasChild();
    int size();
}
