/*
Ricardo Martinez Week 5 Homework Calculator
*/
package week05hwcalc;
import java.util.Scanner; 
public class Week05HWCalc 
{
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) 
    {
    // TODO code application logic here 
    float number1; //number1, operator, and number2 will be
    float number2; //requested from user.
    String operator;
    float answer = 0; //Declare and initialize answer.
    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter the value of the first number.");
    number1 = scan.nextFloat();
    System.out.println("Enter the operator (+, -, x, or /).");
    operator = scan.next();
    System.out.println("Enter the value of the second number.");
    number2 = scan.nextFloat();
    if (operator.equals ("+"))
        answer = number1 + number2;
    if (operator.equals ("-"))
        answer = number1 - number2;
    if (operator.equals ("x"))
        answer = number1 * number2;
    if (operator.equals ("/"))
        answer = number1 / number2;
    else System.out.printf("THE INPUT IS INVALID%nIGNORE THE ANSWER%n");
    System.out.printf("Answer is %f%n", answer);
    }
    }
    
// Good...as improvement, please try more informative output...
