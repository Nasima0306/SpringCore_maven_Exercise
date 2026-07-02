package com.example.SpringMavenExercise.Exercise8;

public class LoggingAspect {
    public void beforeMethod() {
        System.out.println("Before method execution");
    }

    public void afterMethod() {
        System.out.println("After method execution");
    }
}
