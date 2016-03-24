/*
Ricardo Martinez Week 7 lab 2
 */
package week07lab2;

import java.util.Scanner;
import java.util.Random;

public class Week07Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String personPlay; //Person's play -- "R", "P", or "S" 
        String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
        int computerInt; //Randomly generated number used to determine 
        //computer's play
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Hey, let's play Rock, Paper, Scissors!\n"
                + "Please enter a move.\n" + "Rock = R, Paper"
                + "= P, and Scissors = S.");
        System.out.println();
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
        System.out.println("Enter your play: ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison 
        personPlay = personPlay.toUpperCase();
        //See who won. Use nested ifs 
        //In case of tie
        System.out.println("Computer play is: " + computerPlay);
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if ((computerPlay.equals("R") && personPlay.equals("S"))
                || (computerPlay.equals("P") && personPlay.equals("R"))
                || (computerPlay.equals("S") && personPlay.equals("P"))) {
            System.out.println("Computer wins.");
        } else {
            System.out.println("You win.");
        }
    }
}
