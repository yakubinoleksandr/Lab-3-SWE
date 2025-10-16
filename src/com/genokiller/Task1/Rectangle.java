package com.genokiller.Task1;

/**
 * Клас {@code Rectangle} представляє прямокутник із заданими координатами та розмірами.
 * <p>
 * Наслідує базові властивості з {@link GraphicPrimitive} і реалізує поведінку інтерфейсу {@link IGraphic}.
 */
public class Rectangle extends GraphicPrimitive implements IGraphic {

    /**
     * Створює прямокутник із заданими координатами верхнього лівого кута та розмірами.
     *
     * @param x координата X верхнього лівого кута
     * @param y координата Y верхнього лівого кута
     * @param width ширина прямокутника
     * @param height висота прямокутника
     */
    Rectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    /** {@inheritDoc} */
    @Override
    public double getX() { return x; }

    /** {@inheritDoc} */
    @Override
    public double getY() { return y; }

    /** {@inheritDoc} */
    @Override
    public double getWidth() { return width; }

    /** {@inheritDoc} */
    @Override
    public double getHeight() { return height; }

    /**
     * Виводить інформацію про прямокутник:
     * його координати, ширину та висоту.
     */
    @Override
    public void showInfo() {
        System.out.printf("Rectangle: (x=%.1f, y=%.1f, width=%.1f, height=%.1f)%n", x, y, width, height);
    }
}
