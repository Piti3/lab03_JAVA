package org.example;

public abstract class Shape {
    private Color color;

    public abstract double getArea();
    public abstract double getPerimeter();

    public Shape(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    public String getColorDescription() {
        return "Red: " + color.r() + ", Green: " + color.g() + ", Blue: " + color.b() + ", Alpha: " + color.alpha();
    }
}
