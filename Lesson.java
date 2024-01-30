package com.sumrakk;

public class Lesson {
    public static void main(String[] args) {
//        Car mustang = new Car(2024, 360.5f, "Rainbow", new byte[] {100, 0, 100});
//        Truck truck = new Truck(50.5f, new byte[] {1, 2, 3}, false);
//        mustang.engine.setValues(true, 100);
//        truck.engine.setValues(false, 150000);
//        mustang.engine.info();
//        truck.engine.info();

        Car flyCar = new Car(2030, 404.9f, "Blue", new byte[] {1, 1, 1}) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);
                engine.isReady(true);
                System.out.println("Машина летит!");
            }
        };
        flyCar.moveObject(505);
    }
}
