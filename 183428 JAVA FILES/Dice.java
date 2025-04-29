import java.util.Random;
import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Random x = new Random(); //Creating an object.

        int dicerone = x.nextInt(6) + 1; //Generating a random number between 1 and 6.
        int dicertwo = x.nextInt(6) + 1;
        int dicerthree = x.nextInt(6) + 1;
        int total = dicerone + dicertwo + dicerthree; //Calculating the total of the three dice.
        System.out.println("DiceRoll: " + dicerone + " " + dicertwo + " " + dicerthree); //Printing the result of the dice roll.

        if (dicerone == dicertwo && dicertwo == dicerthree){
            System.out.println("You have rolled tripless! +6 Bonus to total");
            total += 6; //Adding 6 to the total if all three dice are the same.
        } else if (dicerone == dicertwo || dicertwo == dicerthree || dicerone == dicerthree) {
            System.out.println("You have rolled a pair! +2 Bonus to total");
            total += 2; //Adding 2 to the total if two dice are the same.
        } else {
            System.out.println("You have rolled a single! No bonus to total");
        }



        //to show you won or lost!
        if (total>=15){
            System.out.println("YOU HAVE WOOOOON!!");
        } else {
            System.out.println("You have lost, try again MATE!");

        }
    }
    
}
