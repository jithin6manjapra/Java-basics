package functions;

import java.util.Scanner;

public class funct {

	//int sum(int,int);
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int add= sum(a,b);
		System.out.println("Total"+add);

	}
	
	
	static int sum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	

}
