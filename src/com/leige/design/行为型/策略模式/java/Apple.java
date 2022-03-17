package com.leige.design.行为型.策略模式.java;

/**
 * Apple
 */
public class Apple implements Comparable<Apple>{
    public int id;
    public double price;

    public Apple(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public int compareTo(Apple o) {
        return o.price >= this.price ? 1 : 0;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
