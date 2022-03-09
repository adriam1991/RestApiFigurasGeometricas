package edu.tecnocampus.java.rest.figurasgeometricas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class FigurasGeometricasController {

    @GetMapping("rectangles")
    public List<Rectangle> getRectangles() {

        return buildRectangles();

    }

    @GetMapping("rectangles/{id}")
    public Rectangle getRectangle(@PathVariable Long id) {
        List<Rectangle> rectangles = buildRectangles();
        for (Rectangle currentRectangle : rectangles) {
            if (id == currentRectangle.getId()) {
                return currentRectangle;
            }
        }

        return null;
    }

    private List<Rectangle> buildRectangles() {
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1L, 10, 10, "Red"));
        rectangles.add(new Rectangle(2L, 15, 15, "Blue"));
        rectangles.add(new Rectangle(3L, 20, 20, "Yellow"));
        rectangles.add(new Rectangle(4L, 25, 25, "Blue"));
        rectangles.add(new Rectangle(5L, 10, 10, "Red"));
        rectangles.add(new Rectangle(6L, 15, 15, "Yellow"));
        rectangles.add(new Rectangle(7L, 30, 20, "Yellow"));
        rectangles.add(new Rectangle(8L, 25, 25, "Blue"));

        return rectangles;
    }

}
