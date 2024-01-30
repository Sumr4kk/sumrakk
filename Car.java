package com.sumrakk;

public class Car extends Vehicle {
    public Car(int yearRelease, float speed, String color, byte[] coordinate) {
        super(yearRelease, speed, color, coordinate);
    }
    @Override
    public void moveObject(float speed) {
        System.out.println("Объект движется со скоростью: " + speed + "км.");
    }
    @Override
    public boolean stopObject() {
        speed = 0;
        return true;
    }
    public Engine engine = new Engine();
}
