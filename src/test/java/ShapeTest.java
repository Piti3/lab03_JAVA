package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class ColorTest {

    @Test
    void toAnsiCode() {
        Color color = new Color(255, 0, 0);
        assertEquals("\u001B[38;2;255;0;0m", color.toAnsiCode());
    }

    @Test
    void testToString() {
        Color color = new Color(100, 150, 200, 255);
        assertEquals("Red: 100, Green: 150, Blue: 200, Alpha: 255", color.toString());
    }

    @Test
    void r() {
        Color color = new Color(120, 100, 90, 255);
        assertEquals(120, color.r());
    }

    @Test
    void g() {
        Color color = new Color(50, 100, 200, 255);
        assertEquals(100, color.g());
    }

    @Test
    void b() {
        Color color = new Color(10, 20, 30, 255);
        assertEquals(30, color.b());
    }

    @Test
    void alpha() {
        Color color = new Color(10, 20, 30, 128);
        assertEquals(128, color.alpha());
    }

    @Test
    void invalidColor() {
        assertThrows(IllegalArgumentException.class, () -> new Color(300, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 0, 0));
    }
}

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 255, 0));
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 255, 0));
        assertEquals(30, rectangle.getPerimeter());
    }

    @Test
    void getA() {
        Rectangle rectangle = new Rectangle(7, 9, new Color(255, 0, 0));
        assertEquals(7, rectangle.getA());
    }

    @Test
    void getB() {
        Rectangle rectangle = new Rectangle(7, 9, new Color(255, 0, 0));
        assertEquals(9, rectangle.getB());
    }

    @Test
    void invalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10, new Color(255, 255, 0)));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -10, new Color(255, 255, 0)));
    }
}

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle(10, 8, 6, 5, new Color(0, 255, 0));
        assertEquals(25, triangle.getArea());
    }

    @Test
    void getPerimeter() {
        Triangle triangle = new Triangle(10, 8, 6, 5, new Color(0, 255, 0));
        assertEquals(24, triangle.getPerimeter());
    }

    @Test
    void getA() {
        Triangle triangle = new Triangle(10, 8, 6, 5, new Color(0, 255, 0));
        assertEquals(10, triangle.getA());
    }

    @Test
    void getH() {
        Triangle triangle = new Triangle(10, 8, 6, 5, new Color(0, 255, 0));
        assertEquals(5, triangle.getH());
    }

    @Test
    void invalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 3, 1, new Color(0, 255, 0)));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 4, 5, -1, new Color(0, 255, 0)));
    }
}

class ShapeDescriberTest {

    @Test
    void describe() {
        ShapeDescriber describer = new ShapeDescriber();
        Rectangle rectangle = new Rectangle(4, 5, new Color(0, 0, 255));

        assertDoesNotThrow(() -> describer.describe(rectangle));
    }

    @Test
    void describeNullShape() {
        ShapeDescriber describer = new ShapeDescriber();
        assertThrows(IllegalArgumentException.class, () -> describer.describe(null));
    }
}

class ShapeRendererTest {

    @Test
    void render() {
        ShapeRenderer renderer = new ShapeRenderer();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5, new Color(255, 0, 0)));
        shapes.add(new Triangle(3, 4, 5, 2, new Color(0, 255, 0)));

        assertDoesNotThrow(() -> renderer.render(shapes));
    }

    @Test
    void renderNullList() {
        ShapeRenderer renderer = new ShapeRenderer();
        assertThrows(IllegalArgumentException.class, () -> renderer.render(null));
    }
}

class ShapeTest {

    @Test
    void getColorDescription() {
        Shape rectangle = new Rectangle(4, 5, new Color(255, 255, 255));
        assertEquals("Red: 255, Green: 255, Blue: 255, Alpha: 0", rectangle.getColorDescription());
    }
}

class MainTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}