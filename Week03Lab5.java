/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week03lab5;

/**
 *
 * @author Dora72
 */
import java.util.Scanner;
public class Week03Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        int number1;
        int number2;
        number1 = input.nextInt();
        number2 = input.nextInt();
        System.out.printf("You entered %d and %d. ", number1, number2);
    }
    
}
