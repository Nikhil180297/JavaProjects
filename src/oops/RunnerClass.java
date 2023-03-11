package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Employee emp1 = new Employee();
	      emp1.Name = "nikhil";
	      emp1.EmpId = 1000;
	      emp1.DisplayName();
	      
	      Employee emp2 = new Employee();
	      emp2.Name = "David";
	      emp2.EmpId = 3456;
	      emp2.DisplayName();
	      
	      Employee emp3 = new Employee("Nikunj",2312);
	      emp3.DisplayName();
	      
	      Employee.DisplaySalary();*/
	      
	      Citizen ct1 = new Citizen();
	      ct1.age = 50;
	      ct1.Name = "Mike";
	      ct1.SSN = 1234;
	      ct1.CountryName ="INDIA";
	      ct1.Print();
	      
	      Citizen ct2 = new Citizen("Rahul","INDIA",25,3456);
	      ct2.Print();
	      
	      
	    Insurance obj1 = new Insurance();
	    obj1.InsuranceId = 5000;
	    obj1.Print();
	}     
    
}
