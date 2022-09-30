package dmdw;
import java.util.Scanner;
public class Problem1 {

  public static void main(String[] args) 
  
  {

    String operator;
    Double a, b;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.nextLine();

    // ask users to enter numbers
    System.out.println("Enter first number");
    a = input.nextDouble();

    System.out.println("Enter second number");
    b = input.nextDouble();

    switch (operator) 
    
    {

      // performs addition between numbers
        case "+":
       
        System.out.println("Addition = " + (a+b));
       
        break;

      
        case "-":
    	  
        System.out.println("Subtraction = " + (a - b));
        
        break;

      
        case "*":
    	  
        System.out.println("Multiplication = " + (a * b));
        
        break;

      
        case "/":
        
        System.out.println("Division = " + (a / b));
        
        break;

        default:
        	
        System.out.println("Invalid operator!");
        
        break;
    }

        input.close();
  }
}