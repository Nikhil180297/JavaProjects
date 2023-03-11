package test;

public class NumberExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = addition(num1,num2);
		//int result = substraction(num1,num2);
		
		System.out.println("The result is:" +result);

	}
	public static int addition(int a,int b) {
		 
		return a+b;

	}
	public static int substraction(int a,int b) {
		 
		return a-b;
	}

}
