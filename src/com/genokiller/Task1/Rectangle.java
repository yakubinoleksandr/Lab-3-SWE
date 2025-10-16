package com.genokiller.Task1;

public class Rectangle
        extends GraphicPrimitive
        implements IGraphic {

    Rectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
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
        System.out.printf("Rectangle: (x=%.1f, y=%.1f, width=%.1f, height=%.1f)%n", x, y, width, height);
    }
}
