package com.leige.design.结构型.装饰者模式;

/**
 * RedShapeDecorator
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("Border Color: Red");
    }
}
