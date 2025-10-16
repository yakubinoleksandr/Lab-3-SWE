package com.genokiller.Task1;

/**
 * Головний клас {@code Main} демонструє роботу з графічними об’єктами.
 * <p>
 * Програма створює кілька графічних примітивів, об’єднує їх у групи
 * і демонструє роботу патерну <b>Composite</b>.
 */
public class Main {

    /**
     * Точка входу в програму.
     * <p>
     * Демонструє створення примітивів ({@link Rectangle}, {@link Circle}, {@link Line}),
     * додавання їх у групи та вкладені групи.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 20, 50, 40);
        Circle circle = new Circle(30, 10, 15);
        Line line = new Line(5, 5, 60, 0);

        System.out.println("=== Окремі примітиви ===");
        rect.showInfo();
        circle.showInfo();
        line.showInfo();

        Group group1 = new Group();
        group1.add(rect);
        group1.add(circle);
        group1.add(line);

        System.out.println("\n=== Група з кількох примітивів ===");
        group1.showInfo();

        Group group2 = new Group();
        group2.add(group1);
        group2.add(new Rectangle(100, 100, 50, 50));
        group2.add(new Circle(80, 80, 10));

        System.out.println("\n=== Вкладена група ===");
        group2.showInfo();
    }
}
