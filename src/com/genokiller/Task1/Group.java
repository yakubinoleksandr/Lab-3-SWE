package com.genokiller.Task1;

import java.util.ArrayList;
import java.util.List;

public class Group implements IGraphic{

    private final List<IGraphic> children = new ArrayList<>();

    public void add(IGraphic graphic) {
        children.add(graphic);
    }

    public void remove(IGraphic graphic) {
        children.remove(graphic);
    }

    @Override
    public double getX() {

        if (children.isEmpty()){
            return 0;
        }

        double minX = children.getFirst().getX();
        for (IGraphic g : children){
            if (g.getX() < minX){
                minX = g.getX();
            }
        }
        return minX;
    }

    @Override
    public double getY() {

        if (children.isEmpty()){
            return 0;
        }

        double minY = children.getFirst().getY();
        for (IGraphic g : children){
            if (g.getY() < minY){
                minY = g.getY();
            }
        }

        return minY;
    }

    @Override
    public double getWidth() {

        if (children.isEmpty()){
            return 0;
        }

        double minX = getX();
        double maxX = minX;
        for (IGraphic g : children){
            double right = g.getX() + g.getWidth();
            if (right > maxX){
                maxX=right;
            }
        }

        return maxX - minX;
    }

    @Override
    public double getHeight() {

        if (children.isEmpty()){
            return 0;
        }


        double minY = getY();
        double maxY = minY;
        for (IGraphic g : children){
            double bottom = g.getY() + g.getHeight();
            if (bottom > maxY){
                maxY = bottom;
            }
        }

        return maxY - minY;
    }

    @Override
    public void showInfo() {
        System.out.println("Group:");
        for (IGraphic g : children) {
            g.showInfo();
        }
        System.out.printf("→ Group bounds: (x=%.1f, y=%.1f, w=%.1f, h=%.1f)%n%n",
                getX(), getY(), getWidth(), getHeight());
    }
}
