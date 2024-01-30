package com.sumrakk;

public class Truck extends Vehicle {
    private boolean isLoaded;
    public Engine engine = new Engine();
    public Truck(float speed, byte[] coordinate) {
        super(speed, coordinate);
    }
    public Truck(float speed, byte[] coordinate, boolean isLoaded) {
        super(speed, coordinate);
        this.isLoaded = isLoaded;
    }
    public void setValues(int yearRelease, float speed, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(yearRelease, speed, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }
    @Override
    public void moveObject(float speed) {
        System.out.println("Объект движется со скоростью: " + speed);
    }
    @Override
    public boolean stopObject() {
        speed = 0;
        return true;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded() {
        if (isLoaded) {
            return "Грузовик загружен!";
        } else {
            return "Грузовик не загружен!";
        }
    }
}
