package oppadd;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     
     
     int num1=12,num2=3,num3=8;
     
     
     
     AddC s1=new AddC();
     AddC s2=new AddC();
     /*   AddC s1=new AddC();
     AddC s2=new AddC();
     
     s1.a=3;
     s1.b=4;
     
     s2.a=9;
     s2.b=8;
     
     */
   s1.add(num1,num2);
   s1.display();
   s2.add(num1,num3);
   s2.display();
    
    		
     
     
	}

}
