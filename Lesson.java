package com.sumrakk;

public class Lesson {
    public static void main(String[] args) {
        Truck truck = new Truck(50.5f, new byte[] {1, 2, 3}, false);
        truck.setValues(2024, 360.5f, "Rainbow", new byte[] {100, 0, 100}, true);
        System.out.println(truck.getValues());
        // Привет
    }
}
