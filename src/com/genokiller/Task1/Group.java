package com.genokiller.Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас {@code Group} реалізує патерн <b>Composite</b>,
 * дозволяючи об'єднувати кілька графічних об'єктів у спільну структуру.
 * <p>
 * Група може містити як окремі примітиви (наприклад, {@link Rectangle}, {@link Circle}, {@link Line}),
 * так і інші групи, створюючи ієрархічну структуру.
 */
public class Group implements IGraphic {

    /**
     * Список дочірніх графічних елементів, що належать групі.
     */
    private final List<IGraphic> children = new ArrayList<>();

    /**
     * Додає графічний об'єкт до групи.
     *
     * @param graphic об'єкт, що реалізує {@link IGraphic}
     */
    public void add(IGraphic graphic) {
        children.add(graphic);
    }

    /**
     * Видаляє графічний об'єкт із групи.
     *
     * @param graphic об'єкт, який потрібно видалити
     */
    public void remove(IGraphic graphic) {
        children.remove(graphic);
    }

    /**
     * Обчислює найменше значення X серед усіх об’єктів у групі.
     * Якщо група порожня — повертає 0.
     *
     * @return мінімальна координата X
     */
    @Override
    public double getX() {
        if (children.isEmpty()) return 0;
        double minX = children.getFirst().getX();
        for (IGraphic g : children) {
            if (g.getX() < minX) minX = g.getX();
        }
        return minX;
    }

    /**
     * Обчислює найменше значення Y серед усіх об’єктів у групі.
     * Якщо група порожня — повертає 0.
     *
     * @return мінімальна координата Y
     */
    @Override
    public double getY() {
        if (children.isEmpty()) return 0;
        double minY = children.getFirst().getY();
        for (IGraphic g : children) {
            if (g.getY() < minY) minY = g.getY();
        }
        return minY;
    }

    /**
     * Обчислює ширину групи як відстань між найлівішою та найправішою точками всіх елементів.
     * Якщо група порожня — повертає 0.
     *
     * @return загальна ширина групи
     */
    @Override
    public double getWidth() {
        if (children.isEmpty()) return 0;
        double minX = getX();
        double maxX = minX;
        for (IGraphic g : children) {
            double right = g.getX() + g.getWidth();
            if (right > maxX) maxX = right;
        }
        return maxX - minX;
    }

    /**
     * Обчислює висоту групи як відстань між найвищою та найнижчою точками всіх елементів.
     * Якщо група порожня — повертає 0.
     *
     * @return загальна висота групи
     */
    @Override
    public double getHeight() {
        if (children.isEmpty()) return 0;
        double minY = getY();
        double maxY = minY;
        for (IGraphic g : children) {
            double bottom = g.getY() + g.getHeight();
            if (bottom > maxY) maxY = bottom;
        }
        return maxY - minY;
    }

    /**
     * Виводить інформацію про всі елементи групи та її межі.
     * <p>
     * Формат виводу:
     * <pre>
     * Group:
     *   Rectangle: ...
     *   Circle: ...
     * → Group bounds: (x=..., y=..., w=..., h=...)
     * </pre>
     */
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
