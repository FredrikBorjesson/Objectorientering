package com.company.Uppgift6;

public class Injector {

    Car car = new Car();

    public void injectWheels(Wheel wheel) {
        car.setWheel(new ChromeWheel());
    }


}
