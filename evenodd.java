package lab;
import java.util.Scanner;
public class evenodd {

	    public static void main(String[] args) {    // main function

	        Scanner reader = new Scanner(System.in);   // scanner

	        System.out.print("Enter a number: ");
	        int num = reader.nextInt();

	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");
	    }
	}
	
