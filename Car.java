package com.sumrakk;

public class Car extends Vehicle implements ILights {
    public Car(int yearRelease, float speed, String color, byte[] coordinate) {
        super(yearRelease, speed, color, coordinate);
    }
    private boolean isOn = false;
    public Car() {}
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
    @Override
    public void setLight(boolean set) {
        isOn = set;
    }
    @Override
    public void blinkLight() {
        System.out.println("Моргаем фарами");
    }
}
