package com.genokiller.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас {@code RectangleAdapter} реалізує інтерфейс {@link IGraphic}
 * і виступає адаптером для прямокутника, що представлений як
 * набір чотирьох ліній ({@link Line}).
 * <p>
 * Використовується шаблон проєктування <b>Adapter</b>.
 */
public class RectangleAdapter implements IGraphic {

    /** Список ліній, що утворюють контур прямокутника. */
    private List<Line> lines = new ArrayList<>();

    /** Поточна ширина екрану, використовується для перетворення координат. */
    private double screenWidth;

    /** Поточна висота екрану, використовується для перетворення координат. */
    private double screenHeight;

    /**
     * Створює новий прямокутник із заданими параметрами.
     * У процесі створення генерує чотири лінії, які формують його сторони.
     *
     * @param centerX      координата X центру прямокутника
     * @param centerY      координата Y центру прямокутника
     * @param width        ширина прямокутника
     * @param height       висота прямокутника
     * @param screenWidth  ширина екрану для перетворення координат
     * @param screenHeight висота екрану для перетворення координат
     */
    public RectangleAdapter(double centerX, double centerY, double width, double height,
                            double screenWidth, double screenHeight) {

        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        double halfW = width / 2;
        double halfH = height / 2;

        // Верхня сторона
        lines.add(new Line(convertX(centerX - halfW), convertY(centerY - halfH),
                convertX(centerX + halfW), convertY(centerY - halfH)));
        // Нижня сторона
        lines.add(new Line(convertX(centerX - halfW), convertY(centerY + halfH),
                convertX(centerX + halfW), convertY(centerY + halfH)));
        // Ліва сторона
        lines.add(new Line(convertX(centerX - halfW), convertY(centerY - halfH),
                convertX(centerX - halfW), convertY(centerY + halfH)));
        // Права сторона
        lines.add(new Line(convertX(centerX + halfW), convertY(centerY - halfH),
                convertX(centerX + halfW), convertY(centerY + halfH)));
    }

    /**
     * Перетворює координату X з відносної системи у координати екрану.
     *
     * @param x вихідне значення координати X
     * @return перетворене значення X для екрану
     */
    private double convertX(double x) {
        return x + screenWidth / 2;
    }

    /**
     * Перетворює координату Y з відносної системи у координати екрану.
     * Вісь Y перевернута (збільшується вниз).
     *
     * @param y вихідне значення координати Y
     * @return перетворене значення Y для екрану
     */
    private double convertY(double y) {
        return screenHeight / 2 - y;
    }

    /**
     * Малює прямокутник, викликаючи метод {@link Line#draw()} для кожної сторони.
     * Реалізація методу {@link IGraphic#draw()}.
     */
    @Override
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}
