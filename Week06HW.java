/*
Ricardo Martinez Week 6 Homework
 */
package week06hw;

import java.util.Scanner;
import java.util.Random;

public class Week06HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String personPlay = ""; //Person's play -- "R", "P", or "S" 
        String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
        int computerInt; //Randomly generated number used to determine 
        //computer's play
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        while (!"X".equals(personPlay)) {
            System.out.println("Hey, let's play Rock, Paper, Scissors!\n"
                    + "Rock = R, Paper"
                    + "= P, and Scissors = S.");
            //Generate computer's play (0,1,2) 
            computerInt = generator.nextInt(3);
            //Translate computer's randomly generated play to 
            //string using if //statements 
            if (computerInt == 0) {
                computerPlay = "R";
            } else if (computerInt == 1) {
                computerPlay = "P";
            } else if (computerInt == 2) {
                computerPlay = "S";
            }
            //Get player's play from input-- note that this is 
            // stored as a string 
            System.out.println("Enter your play or x to exit the game: ");
            personPlay = scan.next();
            //Make player's play uppercase for ease of comparison 
            personPlay = personPlay.toUpperCase();
            //See who won. Use nested ifs 
            //In case of tie
            System.out.println("Computer play is: " + computerPlay);
            if (personPlay.equals(computerPlay)) {
                System.out.println("It's a tie!");
            } else //Person picks Rock
            {
                if (personPlay.equals("R")) {
                    if (computerPlay.equals("S")) {
                        System.out.println("Rock crushes scissors. You win!!");
                    } else if (computerPlay.equals("P")) {
                        System.out.println("Paper eats rock. You lose!!");
                    }
                } //Person picks paper
                else if (personPlay.equals("P")) {
                    if (computerPlay.equals("S")) {
                        System.out.println("Scissor cuts paper. You lose!!");
                    } else if (computerPlay.equals("R")) {
                        System.out.println("Paper eats rock. You win!!");
                    }
                } //Person picks scissors 
                else if (personPlay.equals("S")) {
                    if (computerPlay.equals("P")) {
                        System.out.println("Scissor cuts paper. You win!!");
                    } else if (computerPlay.equals("R")) {
                        System.out.println("Rock breaks scissors. You lose!!");
                    }
                } else {
                    System.out.println("Your play is invalid.");
                }
            }
        }
        System.out.println("You have exited the game.");
    }
}
// Good job, Ricardo
