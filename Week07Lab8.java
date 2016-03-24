/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07lab8;

import java.util.Arrays;

/**
 *
 * @author Dora72
 */
public class Week07Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arraySort = new int[6];
        arraySort[0] = 123;
        arraySort[1] = 456;
        arraySort[2] = 479;
        arraySort[3] = 135;
        arraySort[4] = 246;
        arraySort[5] = 135;
        Arrays.sort(arraySort);
        int i;
        for (i = 0; i < arraySort.length; i++) {
            System.out.println(arraySort[i]);
        }

    }

}
