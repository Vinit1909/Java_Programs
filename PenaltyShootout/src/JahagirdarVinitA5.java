// Importing required packages
import java.util.Random;

public class JahagirdarVinitA5 {
    public static void main(String[] args) {
        Attacker attacker = new Attacker("Erling Haaland", 22, "Norway");     //creating Attacker class object
        Goalkeeper goalkeeper = new Goalkeeper("David de Gea", 32, "Spain");  //creating Goalkeeper class object

        Random rand = new Random();  // generating random numbers between 0 and 1

        //Penalty shootout begins
        for(int i = 0; i < 5; i++){
            float rand_shot = rand.nextFloat();
            if (rand_shot > 0.5){
                System.out.println("Attacker scored");
                attacker.score();  //calling score method from Attacker class
                goalkeeper.concede();  //calling concede method from Goalkeeper class
            }
            else{
                System.out.println("Goalkeeper saved");
                goalkeeper.save();  //calling save method from Goalkeeper class
                attacker.miss();  //calling miss method from Attacker class
            }
        }

        attacker.printInfo();  //calling printInfo method from Attacker class which overrides the printInfo method in Player Class
        goalkeeper.printInfo();  //calling printInfo method from Goalkeeper class which overrides the printInfo method in Player Class

        //calling isLeading method from the Player class to check who is leading!
        if (Player.isLeading(attacker, goalkeeper)){
            System.out.println("\n"+attacker.getName()+" leads "+ goalkeeper.getName()+" by "+ (attacker.calculateTotalPoints() - goalkeeper.calculateTotalPoints())+" points.");
        }
        else{
            System.out.println("\n"+goalkeeper.getName()+" leads "+ attacker.getName() +" by "+ (goalkeeper.calculateTotalPoints() - attacker.calculateTotalPoints() )+" points.");
        }

        System.out.println("Program Completed");
    }
}
