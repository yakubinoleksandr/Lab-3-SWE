package com.genokiller.Task2;

public class Line implements IGraphic {

    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
}
