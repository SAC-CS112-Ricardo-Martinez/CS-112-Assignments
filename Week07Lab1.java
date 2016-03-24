/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07lab1;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Week07Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int count = 1;
        //Person enters a number from 1 to 10  
        int computerNumber; //Randomly generated number used to determine 
        //computer's number
        //Scanner scan = new Scanner(System.in);
        computerNumber = 1 + (int) (Math.random() * 10);
        while (count < 4) {
            String number
                    = JOptionPane.showInputDialog("Type an integer between 1 and 10.");
            int personNumber = Integer.parseInt(number);
            //System.out.println("Please type an integer from 1 to 10.");
            //personNumber = scan.nextInt();
            if (computerNumber == personNumber) {
                System.out.println("You chose wisely.");
                count = 4;
            } else if (computerNumber > personNumber) {
                System.out.println("You chose low.");
            } else {
                System.out.println("You chose high.");
            }
            count++;
        }
        System.out.printf("The computer number is %d%n", computerNumber);
    }
}
