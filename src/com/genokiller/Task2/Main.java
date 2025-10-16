package com.genokiller.Task2;

public class Main {

    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 600;

    public static void main(String[] args) {

        Line line = new Line(50, 50, 50, 50);
        line.draw();

        IGraphic rectangle = new RectangleAdapter(0,0,100,50, SCREEN_WIDTH, SCREEN_HEIGHT);
        rectangle.draw();
    }

}
