package edu.tecnocampus.java.rest.figurasgeometricas;

import java.util.Objects;

public class Rectangle extends GeometricFigure {
    private int high;
    private int width;

    public Rectangle(Long id, int high, int width, String color) {
        super(id, color);
        this.high = high;
        this.width = width;
    }

    public Rectangle(int high, int width, String color) {

        this.high = high;
        this.width = width;
        this.color = color;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return high == rectangle.high && width == rectangle.width && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(high, width, color);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "high=" + high +
                ", width=" + width +
                ", color=" + color + '\'' +
                ", area='" + calculateAreaRectangle() + '\'' +

                '}';
    }

    public double calculateAreaRectangle() {

        return high * width;
    }


}

