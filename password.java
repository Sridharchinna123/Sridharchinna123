package lab;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String pass =s.next();
		System.out.println("Re-enter Your Password");
		String conf =s.next();
		if(pass.equals(conf)) {
			System.out.println("Password is Matched");
		}else
		{
			System.out.println("Password is Not Matched");
		}
		}

}
