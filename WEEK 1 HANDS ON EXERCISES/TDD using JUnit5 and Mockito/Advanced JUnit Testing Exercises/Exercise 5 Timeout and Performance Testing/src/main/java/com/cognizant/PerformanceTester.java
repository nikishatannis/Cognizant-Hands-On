package com.cognizant;

public class PerformanceTester {

    public void performTask() {
        // Simulate a task that takes 1 second
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}