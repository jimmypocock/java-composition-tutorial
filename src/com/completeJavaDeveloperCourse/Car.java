package com.completeJavaDeveloperCourse;

/**
 * Created by jimmypocock on 4/24/16.
 */
public class Car extends Vehicle { // extends allows inheritance
    private int doors;
    private int engineCapacity;

    public Car(String name, int engineCapacity, int doors) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
