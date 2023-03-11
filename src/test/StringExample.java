package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               String name1= "Nikhil is from the Arsikere";
               String name2 = "Crazybee";
               
               System.out.println("Num of char in the string is " + name1.length());
               
               System.out.println("the 4th chart of the string is " + name1.charAt(4));
               
               System.out.println("the last chart of the string is " + name1.charAt(name1.length()-1));
               
               System.out.println("the string in upper case is " +name1.toUpperCase());
               
               System.out.println("the string in lower case is " +name1.toLowerCase());
	}

}
