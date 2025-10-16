package com.genokiller.Task2;

/**
 * Головний клас програми, який демонструє роботу інтерфейсу {@link IGraphic}
 * та його реалізацій — {@link Line} і {@link RectangleAdapter}.
 */
public class Main {

    /** Ширина екрану в пікселях. */
    private static final int SCREEN_WIDTH = 800;

    /** Висота екрану в пікселях. */
    private static final int SCREEN_HEIGHT = 600;

    /**
     * Точка входу в програму.
     * Створює об’єкти {@link Line} та {@link RectangleAdapter}
     * і викликає їхні методи {@code draw()}.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {

        Line line = new Line(50, 50, 50, 50);
        line.draw();

        IGraphic rectangle = new RectangleAdapter(0, 0, 100, 50, SCREEN_WIDTH, SCREEN_HEIGHT);
        rectangle.draw();
    }

}
