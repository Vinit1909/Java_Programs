package com.penaltyshootout.assignment;

import java.util.Random;

public class Attacker extends Player{
    private int goalsScored = 0;

    private int goalsMissed = 0;

    public Attacker(String name, int age, String team) {
        super(name, age, team);
    }

    public void score(){
        goalsScored++;
    }

    public void miss(){
        goalsMissed++;
    }

    public int calculateTotalPoints(){
        setTotalPoints(goalsScored, goalsMissed);
        if (getTotalPoints() < 0){
            return 0;
        }
        return getTotalPoints();
    }

    public void printInfo(){
        System.out.println("\nName: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Team: "+ getTeam());
        System.out.println("Type: Attacker");
        System.out.println("Goals Scored: "+ goalsScored);
        System.out.println("Goals Missed: "+ goalsMissed);
        System.out.println("Total Points: "+ calculateTotalPoints());
    }
}
