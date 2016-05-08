package com.saddham.service;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by saddhamp on 3/5/16.
 */
public class PrintService {
    private String firstName;
    private String lastName;

    @Scheduled(fixedRate = 5000)
    public void printFullNameWithFixedRate() {
        System.out.println("Full name with fixed rate: " + firstName + " " + lastName);
    }

    @Scheduled(fixedDelay = 5000, initialDelay = 5000)
    public void printFullNameWithFixedDelay(){
        System.out.println("Full name with fixed delay: " + firstName + " "+lastName);
    }

    @Scheduled(cron = "0/5 45 11 * * MON-FRI", zone = "Asia/Kolkata")
    public void printFullNameWithCronExpression(){
        System.out.println("Full name with cron expression: " + firstName + " "+lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}