package com.penaltyshootout.assignment;

import java.sql.SQLOutput;
import java.util.Random;

public abstract class Player {
    //Class data members
    private String name;
    private int age;
    private int totalPoints;
    private String team;
    public static int shots = 5;


    //Constructor
    public Player(String name, int age, String team){
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getTeam(){
        return this.team;
    }

    public int getTotalPoints(){
        return totalPoints;
    }

    public int setTotalPoints(int scenario1, int scenario2){
        this.totalPoints = scenario1 - scenario2;
        return totalPoints;
    }

    //Class Methods
    public abstract void printInfo();

    public static boolean isLeading(Attacker at, Goalkeeper gk){
        int attackerPoints = at.calculateTotalPoints();
        int goalkeeperPoints = gk.calculateTotalPoints();
        return attackerPoints > goalkeeperPoints;
    }

    public abstract int calculateTotalPoints();

}


