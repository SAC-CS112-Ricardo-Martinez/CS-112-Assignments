/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week07hw;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Dora72
 */
public class Week07HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] board = new char[3][3];
        String i = "";
        String row;
        String column;
        char p2;
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n----------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n----------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
        String playerSymbol
                = JOptionPane.showInputDialog("Player 1 please enter your choice of x or o.");
        if (playerSymbol.equals("x")) {
            p2 = 'o';
        } else {
            p2 = 'x';
        }
        while (!"Done".equals(i)) {
            row
                    = JOptionPane.showInputDialog("Player 1 please enter a row 1-3.");
            int rowNumber = Integer.parseInt(row) - 1;
            column
                    = JOptionPane.showInputDialog("Player 1 please enter a column 1-3.");
            int columnNumber = Integer.parseInt(column) - 1;
            char p = playerSymbol.charAt(0);
            if (board[rowNumber][columnNumber] == '\u0000') {
                board[rowNumber][columnNumber] = p;
            }
            System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n---------");
            System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n---------");
            System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
            row
                    = JOptionPane.showInputDialog("Player 2 please enter a row 1-3.");
            rowNumber = Integer.parseInt(row) - 1;
            column
                    = JOptionPane.showInputDialog("Player 2 please enter a column 1-3.");
            columnNumber = Integer.parseInt(column) - 1;
            if (board[rowNumber][columnNumber] == '\u0000') {
                board[rowNumber][columnNumber] = p2;
            }
            System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n---------");
            System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n---------");
            System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
            if ((board[0][0] == p && board[0][1] == p && board[0][2] == p)
                    || (board[1][0] == p && board[1][1] == p && board[1][2] == p)
                    || (board[2][0] == p && board[2][1] == p && board[2][2] == p)
                    || (board[0][0] == p && board[1][0] == p && board[2][0] == p)
                    || (board[0][1] == p && board[1][1] == p && board[2][1] == p)
                    || (board[0][2] == p && board[1][2] == p && board[2][2] == p)
                    || (board[0][0] == p && board[1][1] == p && board[2][2] == p)
                    || (board[2][0] == p && board[1][1] == p && board[0][2] == p)) {
                i = "Done";
                System.out.println(p + " is the winner!");
            } else if ((board[0][0] == p2 && board[0][1] == p2 && board[0][2] == p2)
                    || (board[1][0] == p2 && board[1][1] == p2 && board[1][2] == p2)
                    || (board[2][0] == p2 && board[2][1] == p2 && board[2][2] == p2)
                    || (board[0][0] == p2 && board[1][0] == p2 && board[2][0] == p2)
                    || (board[0][1] == p2 && board[1][1] == p2 && board[2][1] == p2)
                    || (board[0][2] == p2 && board[1][2] == p2 && board[2][2] == p2)
                    || (board[0][0] == p2 && board[1][1] == p2 && board[2][2] == p2)
                    || (board[2][0] == p2 && board[1][1] == p2 && board[0][2] == p2)) {
                i = "Done";
                System.out.println(p2 + " is the winner!");
            } else if ((board[0][0] != '\u0000' && board[0][1] != '\u0000' && board[0][2] != '\u0000')
                    && (board[1][0] != '\u0000' && board[1][1] != '\u0000' && board[1][2] != '\u0000')
                    && (board[2][0] != '\u0000' && board[2][1] != '\u0000' && board[2][2] != '\u0000')
                    && (board[0][0] != '\u0000' && board[1][0] != '\u0000' && board[2][0] != '\u0000')
                    && (board[0][1] != '\u0000' && board[1][1] != '\u0000' && board[2][1] != '\u0000')
                    && (board[0][2] != '\u0000' && board[1][2] != '\u0000' && board[2][2] != '\u0000')
                    && (board[0][0] != '\u0000' && board[1][1] != '\u0000' && board[2][2] != '\u0000')
                    && (board[2][0] != '\u0000' && board[1][1] != '\u0000' && board[0][2] != '\u0000')) {
                i = "Done";
                System.out.println("It's a tie!");
            }
        }
    }
}
