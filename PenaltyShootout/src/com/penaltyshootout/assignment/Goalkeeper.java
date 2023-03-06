package com.penaltyshootout.assignment;

import java.util.Random;

public class Goalkeeper extends Player{
    private int goalsSaved = 0;
    private int goalsConceded = 0;


    public Goalkeeper(String name, int age, String team) {
        super(name, age, team);
    }

    public void save(){
        goalsSaved++;
    }

    public void concede(){
        goalsConceded++;
    }

    public int calculateTotalPoints(){
        setTotalPoints(goalsSaved, goalsConceded);
        if (getTotalPoints() < 0){
            return 0;
        }
        return getTotalPoints();
    }

    public void printInfo(){
        System.out.println("\nName: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Team: "+ getTeam());
        System.out.println("Type: Goalkeeper");
        System.out.println("Goals Saved: "+ goalsSaved);
        System.out.println("Goals Conceded: "+ goalsConceded);
        System.out.println("Total Points: "+ calculateTotalPoints());
    }
}
