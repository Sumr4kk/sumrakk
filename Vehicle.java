package com.sumrakk;

public abstract class Vehicle {
    private int yearRelease;
    protected float speed;
    private String color;
    private byte[] coordinate;
    public Vehicle(int yearRelease, float speed, String color, byte[] coordinate) {
        setValues(yearRelease, speed, color, coordinate);
    }
    public Vehicle(float speed, byte[] coordinate) {
        this.speed = speed;
        this.coordinate = coordinate;
    }
    protected void setValues(int yearRelease, float speed, String color, byte[] coordinate) {
        this.yearRelease = yearRelease;
        this.speed = speed;
        this.color = color;
        this.coordinate = coordinate;
    }
    protected String getValues() {
        String info = "Год выпуска: " + yearRelease + "г\nСкорость: " + speed + "км/ч\nЦвет: " + color + "\n";
        String infoCoordinate = "Местонахождение: ";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + " ";
        }
        return info + infoCoordinate + "\n";
    }
}
