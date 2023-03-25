package com.scaler.lldANDhld.inheritance;

public class Instructor extends User {
    String batchName;
    double averageRating;

    void scheduleClass() {
        System.out.println("Scheduling a class");
    }
}