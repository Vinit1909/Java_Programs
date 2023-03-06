package com.penaltyshootout.assignment;

import java.util.Random;

public class JahagirdarVinitA5 {
    public static void main(String[] args) {
        Attacker attacker = new Attacker("Erling Haaland", 22, "Norway");
        Goalkeeper goalkeeper = new Goalkeeper("David de Gea", 32, "Spain");

        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            float rand_shot = rand.nextFloat();
            if (rand_shot > 0.5){
                System.out.println("Attacker scored");
                attacker.score();
                goalkeeper.concede();
            }
            else{
                System.out.println("Goalkeeper saved");
                goalkeeper.save();
                attacker.miss();
            }
        }

        attacker.printInfo();
        goalkeeper.printInfo();

        if (Player.isLeading(attacker, goalkeeper)){
            System.out.println("\n"+attacker.getName()+" leads "+ goalkeeper.getName()+" by "+ (attacker.calculateTotalPoints() - goalkeeper.calculateTotalPoints())+" points.");
        }
        else{
            System.out.println("\n"+goalkeeper.getName()+" leads "+ attacker.getName() +" by "+ (goalkeeper.calculateTotalPoints() - attacker.calculateTotalPoints() )+" points.");
        }

        System.out.println("Program Completed");
    }
}
