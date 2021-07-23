package sub;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		subtract s1=new subtract();
		s1.sub(num1,num2);
		

	}

}
