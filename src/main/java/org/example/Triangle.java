package org.example;

public class Triangle extends Shape {
    private double a,b,c,h;

    public Triangle (double a, double b, double c, double h, Color color) {
        super(color);
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("zle wartosci scian trojkata.");
        }
        if (h <= 0) {
            throw new IllegalArgumentException("Wysokosc musi byc wieksza od zera.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getArea() {
        return (a * h)/2;
    }

    public double getPerimeter() {
        return a+b+c;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

}
