package com.leige.design.结构型.组合模式;

import java.util.ArrayList;

/**
 * MenuItem
 */
public class MenuItem extends MenuComponent{
    ArrayList<Component> menuComponents = new ArrayList<>();
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void add(Component component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(Component component) {
        menuComponents.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public boolean hasChild(){
        if(menuComponents.size() > 0){
            return true;
        }
        return false;
    }
    @Override
    public int size() {
        return menuComponents.size();
    }
    public String printItem(){
        return "";
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                ",menuComponents=" + menuComponents +
                '}';
    }
}
