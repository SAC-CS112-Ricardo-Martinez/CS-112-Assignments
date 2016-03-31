/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08lab1;

import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author Dora72
 */
public class Week08Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cal;
        int age;
        int year;
        String name
                = JOptionPane.showInputDialog("Please type in your name.");
        String birthYear
                = JOptionPane.showInputDialog("Please type in your birth year.");
        year = Integer.parseInt(birthYear);
        cal = Calendar.getInstance().get(Calendar.YEAR);
        age = cal - year;
        System.out.println("Hello, " + name + ". You're " + age + " years old today.");
    }

}
