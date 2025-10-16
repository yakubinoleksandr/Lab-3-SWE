package com.genokiller.Task2;

/**
 * Клас {@code Line} представляє лінію, що має дві точки —
 * початкову та кінцеву. Реалізує інтерфейс {@link IGraphic}.
 */
public class Line implements IGraphic {

    /** Координата X початкової точки лінії. */
    private double x1;

    /** Координата Y початкової точки лінії. */
    private double y1;

    /** Координата X кінцевої точки лінії. */
    private double x2;

    /** Координата Y кінцевої точки лінії. */
    private double y2;

    /**
     * Створює новий об’єкт лінії з вказаними координатами.
     *
     * @param x1 координата X початкової точки
     * @param y1 координата Y початкової точки
     * @param x2 координата X кінцевої точки
     * @param y2 координата Y кінцевої точки
     */
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Виводить у консоль інформацію про лінію.
     * Реалізація методу {@link IGraphic#draw()}.
     */
    @Override
    public void draw() {
        System.out.println("Drawing line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
}
