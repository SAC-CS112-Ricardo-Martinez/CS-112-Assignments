/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week05lab4;
import java.util.Scanner;
/**
 *
 * @author Dora72
 */
public class Week05Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int thirsty;
        int breakfast;
        System.out.println("Hungry");
        System.out.println("Get in line");
        System.out.println("Buy lunch");
        System.out.println("Are you thirsty? Type 1 for yes.");
        Scanner scan = new Scanner(System.in);
        thirsty = scan.nextInt();
        if (thirsty == 1)
        {
            System.out.println("Did you have breakfast? Type 11 for yes.");
            breakfast = scan.nextInt();
            if (breakfast == 11)
                System.out.println("Get Diet Coke");
            else System.out.println("Get Coke");
        }
        else System.out.println("Get water");
        System.out.println("Eat lunch");
        System.out.println("Return tray");
        System.out.println("Leave");
    }
    
}
