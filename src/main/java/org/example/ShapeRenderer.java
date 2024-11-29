package org.example;
import java.util.List;

public class ShapeRenderer {

    public void render(List<Shape> shapes) {
        if (shapes == null) {
            throw new IllegalArgumentException("Lista figur nie moze byc null");
        }
        for (Shape shape : shapes) {
            String shapeType = shape.getClass().getSimpleName();
            System.out.println("=== " + shapeType + " ===");
            System.out.println("Kolor: " + shape.getColorDescription());
            System.out.println("Pole: " + shape.getArea());
            System.out.println("Obwod: " + shape.getPerimeter());
            System.out.println("Rysowanie figury:");
            drawShape(shape);
            System.out.println();
        }
    }

    private void drawShape(Shape shape) {
        if (shape instanceof Rectangle rectangle) {
            drawRectangle(rectangle);
        } else if (shape instanceof Triangle triangle) {
            drawTriangle(triangle);
        } else {
            System.out.println("Nieznana figura.");
        }
    }

    private void drawRectangle(Rectangle rectangle) {
        int height = (int) rectangle.getB();
        int width = (int) rectangle.getA();
        String colorCode = rectangle.getColor().toAnsiCode();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print(colorCode + "X" + "\u001B[0m");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void drawTriangle(Triangle triangle) {
        int height = (int) triangle.getH();
        int base = (int) triangle.getA();
        int midPoint = base / 2;
        String colorCode = triangle.getColor().toAnsiCode();

        for (int i = 0; i < height; i++) {
            int numStars = 1 + 2 * i;
            int padding = (base - numStars) / 2;

            for (int j = 0; j < padding; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numStars; j++) {
                System.out.print(colorCode + "X" + "\u001B[0m");
            }
            System.out.println();
        }
    }
}
