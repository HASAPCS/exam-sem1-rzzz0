package com.example;

public class StepTracker {
    private int minSteps;
    private int total;
    private int days;
    private int activeDays;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.total = 0;
        this.days = 0;
        this.activeDays = 0;
    }

    public void addDailySteps(int steps) {
        if (steps >= minSteps) {
            activeDays++;
        }
        total += steps;
        days++;
    }
    public int activeDays(){
       return activeDays;
    }
        
    public double averageSteps(){
        if(days == 0){
            return 0;
        }
        return (double) total/days;
    }
}
//write your class implementation here
