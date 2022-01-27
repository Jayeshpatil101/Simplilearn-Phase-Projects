package AssistedProjects;
import java.util.Scanner;


public class ArithmeticOperations {
	public static void main(String args[])
	  {
	    int first, second, add, subtract, multiply;
	    float devide;
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    first = scan.nextInt();
	    second = scan.nextInt();

	    add = first + second;
	    subtract = first - second;
	    multiply = first * second;
	    devide = (float) first / second;

	    System.out.println("Sum = " + add);
	    System.out.println("Difference = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + devide);
	  }
	}