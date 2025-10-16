package com.genokiller.Task1;

/**
 * Клас {@code Line} представляє лінію, визначену початковою точкою та розміром.
 * <p>
 * Може використовуватись як горизонтальна, вертикальна або діагональна лінія.
 */
public class Line extends GraphicPrimitive implements IGraphic {

    /**
     * Створює лінію, задану початковими координатами та розміром.
     *
     * @param x координата X початку лінії
     * @param y координата Y початку лінії
     * @param width довжина по осі X
     * @param height довжина по осі Y
     */
    Line(double x, double y, double width, double height) {
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
     * Виводить інформацію про лінію: координати початку та довжину по обох осях.
     */
    @Override
    public void showInfo() {
        System.out.printf("Line: start(%.1f, %.1f), size(%.1f, %.1f)%n", x, y, width, height);
    }
}
