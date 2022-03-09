package edu.tecnocampus.java.rest.figurasgeometricas;

public class GeometricFigure {

    private Long id;
    public String color;

    public GeometricFigure() {

    }

    public GeometricFigure(Long id, String color) {
        this.id = id;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "color='" + color + '\'' +
                '}';
    }


}
