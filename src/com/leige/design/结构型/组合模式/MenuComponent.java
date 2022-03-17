package com.leige.design.结构型.组合模式;

/**
 * MenuComponent
 */
public class MenuComponent implements Component{
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public boolean hasChild() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
