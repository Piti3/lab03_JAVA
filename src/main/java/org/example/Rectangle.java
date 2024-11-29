package org.example;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b, Color color) {
        super(color);
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Zmienne musza byc dodatnie.");
        }
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
    public double getPerimeter() {
        return 2*(a+b);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
