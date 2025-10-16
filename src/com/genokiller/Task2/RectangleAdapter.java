package com.genokiller.Task2;

import java.util.ArrayList;
import java.util.List;

public class RectangleAdapter implements IGraphic {

    private List<Line> lines = new ArrayList<>();
    private double screenWidth;
    private double screenHeight;

    public RectangleAdapter(double centerX, double centerY, double width, double height,
                            double screenWidth, double screenHeight) {

        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        double halfW = width / 2;
        double halfH = height / 2;

        lines.add(new Line(convertX(centerX - halfW), convertY(centerY - halfH),
                convertX(centerX + halfW), convertY(centerY - halfH)));
        lines.add(new Line(convertX(centerX - halfW), convertY(centerY + halfH),
                convertX(centerX + halfW), convertY(centerY + halfH)));
        lines.add(new Line(convertX(centerX - halfW), convertY(centerY - halfH),
                convertX(centerX - halfW), convertY(centerY + halfH)));
        lines.add(new Line(convertX(centerX + halfW), convertY(centerY - halfH),
                convertX(centerX + halfW), convertY(centerY + halfH)));
    }

    private double convertX(double x) {
        return x + screenWidth / 2;
    }

    private double convertY(double y) {
        return screenHeight / 2 - y;
    }

    @Override
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}
