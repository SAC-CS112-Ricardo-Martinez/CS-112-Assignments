/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08lab5;

import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author Dora72
 */
public class Week08Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cal;
        int age;
        int year;
        int oldEnough;
        String exit = null;       
        while (!"x".equals (exit)){
        String name 
                = JOptionPane.showInputDialog("Please type in your name.");
        String birthYear
                = JOptionPane.showInputDialog("Please type in your birth year.");
        year = Integer.parseInt(birthYear);
        cal = Calendar.getInstance().get(Calendar.YEAR);
        age = cal - year;
        System.out.println("Hello, " + name + ". You're " + age + " years old today.");
        if (age >= 21){
            System.out.println("You are lawfully allowed to drink alcohol.");
        }
        if (age < 21){
          oldEnough = 21 - age + cal;
          System.out.println("You will be old enough to drink alcohol in " + oldEnough + ".");
        exit
                = JOptionPane.showInputDialog("Type x to exit or any key to try again.");  
        }
    }
    }
}
