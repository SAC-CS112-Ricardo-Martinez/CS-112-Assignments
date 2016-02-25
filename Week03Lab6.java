/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week03lab6;

/**
 *
 * @author Dora72
 */
import java.util.Scanner;
public class Week03Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        int number1;
        int number2;
        int sum;
        number1 = input.nextInt();
        number2 = input.nextInt();
        System.out.printf("You entered %d and %d.\n", number1, number2);
        sum = number1+number2;
        System.out.printf("Their sum is %d.", sum);
    }
    
}