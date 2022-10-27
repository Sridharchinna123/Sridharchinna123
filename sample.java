package lab;
import java.util.*;
import java.util.Scanner;
public class sample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four digit number");
		int num = sc.nextInt();
		sc.close();
		float i = (((num+8)/3)%5)*5;
		System.out.println("result"+i);
		
	}

}
