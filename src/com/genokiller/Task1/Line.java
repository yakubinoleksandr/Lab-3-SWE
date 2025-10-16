package com.genokiller.Task1;

public class Line
        extends GraphicPrimitive
        implements IGraphic {

    Line(double x, double y, double width, double height) {
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
        System.out.printf("Line: start(%.1f, %.1f), size(%.1f, %.1f)%n", x, y, width, height);
    }
}
