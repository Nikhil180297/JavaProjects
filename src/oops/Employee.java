package oops;

public class Employee {
	
	   public String Name;
		public int EmpId;
		private static int salary = 50000;
			
public Employee() {
			
		 System.out.println("inside default constructor"); 
		}  
		
public Employee(String var1, int var2) {
			
	System.out.println("inside parameter constructor");
	
			Name=var1;
			EmpId=var2;
		}
		public void DisplayName() {
			
			System.out.println("Name of the employee is " +Name);
			System.out.println("EmployeeID of the employee is " +EmpId);
		}
		
		public static void DisplaySalary() {
			System.out.println("Name of the employee is " + salary);
		}
}
