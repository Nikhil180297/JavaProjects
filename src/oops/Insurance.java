package oops;

public class Insurance extends Citizen {
	
   public int InsuranceId;
   
   public Insurance() {
	   
	   System.out.println("Inside the defalt constructor of Insurance");
   }
   
   public void Print() {
	   
	   System.out.println("Insurance Id is "+InsuranceId);
   }
}
