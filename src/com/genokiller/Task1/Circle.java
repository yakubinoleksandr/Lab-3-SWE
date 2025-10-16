package com.genokiller.Task1;

public class Circle
        extends GraphicPrimitive
        implements IGraphic {

    Circle(double x, double y, double radius) {
        super(x, y, radius*2, radius*2);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void showInfo() {
        System.out.printf("Circle: center(%.1f, %.1f), diameter=%.1f%n", x, y, width);
    }
}
