package ifstatement;

import java.util.Scanner;

public class state {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		
		if(a>=0) {
			System.out.println("Positive");	
			   	}
		else{
			System.out.println("Negative");	
		}
	}

}
