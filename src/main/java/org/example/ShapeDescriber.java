package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
private static final Logger log = LoggerFactory.getLogger(ShapeDescriber.class);

    public void describe(Shape shape) {
        if (shape == null) {
            throw new IllegalArgumentException("Figura nie moze byc null.");
        }
        log.info("Start programu");

        String shapeType = shape.getClass().getSimpleName();
        String colorDescription = shape.getColorDescription();
        double area = shape.getArea();
        double perimeter = shape.getPerimeter();

        log.info("Typ figury: " + shapeType);
        log.info("Kolor figury: " + colorDescription);
        log.info("Pole figury: " + area);
        log.info("Obwod figury: " + perimeter);

        System.out.println("Pole figury: " + shape.getArea());
        System.out.println("Obwod figury: " + shape.getPerimeter());
        System.out.println("Kolor figury: " + shape.getColorDescription());

        log.info("Koniec programu");
    }
}
