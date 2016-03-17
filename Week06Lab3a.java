/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week06lab3a;

import java.util.Scanner;

public class Week06Lab3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int personNumber; //Person enters a number from 1 to 10  
        int computerNumber; //Randomly generated number between 1 and 10
        Scanner scan = new Scanner(System.in);
        computerNumber = 1 + (int) (Math.random() * 10);
        System.out.println("Please chose a number from 1 to 10.");
        personNumber = scan.nextInt();
        if (computerNumber == personNumber) {
            System.out.println("You chose wisely.");
        } else if ((computerNumber > personNumber) || (computerNumber < personNumber)) {
            System.out.println("You chose unwisely.");
        }
        System.out.printf("The computer number is %d.%n", computerNumber);
    }
}
