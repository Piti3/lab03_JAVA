package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Color red = new Color(255, 0, 0);
        Color green = new Color(0, 255, 0);

        Rectangle rectangle = new Rectangle(5.0, 3.0, red);
        Triangle triangle = new Triangle(7.0, 4.0, 4.0, 4, green);

        // ShapeDescriber
        ShapeDescriber shapeDescriber = new ShapeDescriber();

        System.out.println("================= ZAD 1-3 =================");
        // Prostokąt
        System.out.println("\n=== Rectangle ===");
        shapeDescriber.describe(rectangle);

        // Trójkąt
        System.out.println("\n=== Triangle ===");
        shapeDescriber.describe(triangle);

        // Color test
        System.out.println("\n=== Color ===");
        try {
            Color validColor = new Color(255, 100, 50, 128);
            System.out.println("Poprawny kolor: (" + validColor.r() + ", " + validColor.g() + ", " + validColor.b() + ", " + validColor.alpha() + ")");

            Color invalidColor = new Color(300, -20, 50);
        } catch (IllegalArgumentException e) {
            System.out.println("Blad koloru: " + e.getMessage());
        }

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(triangle);

        // ShapeRenderer
        ShapeRenderer shapeRenderer = new ShapeRenderer();
        System.out.println("\n================= ZAD 4 =================");
        System.out.println("=== Rysowanie figur ===");
        shapeRenderer.render(shapes);

    }
}
