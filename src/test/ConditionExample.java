package test;

import java.util.Scanner;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age= 18;
        
        Scanner scanner = new Scanner(System.in);  //object of Scanner class
        
        System.out.println("Enter the Age ");
        
        age = scanner.nextInt();//nextInt is the method of scanner (object)
        
        
      if(age<17) {
        	
          System.out.println("you are not eligible for voting");
       }
        else if(age == 17) {
        	
        	System.out.println("you are eligible for voting next year");
        }
      else {
        System.out.println("you are eligible for voting");
	}
        
      scanner.close();
	}
}
