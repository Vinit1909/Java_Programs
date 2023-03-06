public class Attacker extends Player{
    //Class data members
    private int goalsScored = 0;
    private int goalsMissed = 0;

    //Constructor
    public Attacker(String name, int age, String team) {
        super(name, age, team);
    }

    //Class methods
    public void score(){
        goalsScored++;
    }  //incrementing goalScored after attacker scores

    public void miss(){
        goalsMissed++;
    }  //incrementing goalsMissed after attacker scores

    public int calculateTotalPoints(){
        setTotalPoints(goalsScored, goalsMissed);
        //condition to return 0 if totalPoints holds a negative value
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
