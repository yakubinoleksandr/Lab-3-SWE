package com.genokiller.Task1;

/**
 * Клас {@code Circle} представляє коло.
 * <p>
 * Визначається координатами центру (x, y) та радіусом.
 * У внутрішніх полях зберігає діаметр як ширину та висоту.
 */
public class Circle extends GraphicPrimitive implements IGraphic {

    /**
     * Створює коло з указаними координатами центру та радіусом.
     *
     * @param x координата X центру кола
     * @param y координата Y центру кола
     * @param radius радіус кола
     */
    Circle(double x, double y, double radius) {
        super(x, y, radius * 2, radius * 2);
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
     * Виводить інформацію про коло:
     * координати центру та діаметр.
     */
    @Override
    public void showInfo() {
        System.out.printf("Circle: center(%.1f, %.1f), diameter=%.1f%n", x, y, width);
    }
}
