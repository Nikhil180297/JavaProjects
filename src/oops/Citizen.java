package oops;

public class Citizen extends Person {

	public int SSN;
	
	public Citizen() {
		System.out.println("inside default constructor of citizen");
	}
	
	public Citizen(String Name,String CountryName,int age,int SSN) {
		
		System.out.println("inside parameter constructor of Citizen");
		this.Name = Name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;
			
			//System.out.println("Name of the citizen is " +Name);
			//System.out.println("CountryName of the citizen is " +CountryName);
	}
			public void Print() {
				
				System.out.println("SSN is "+ SSN);
				
			}
			
	}
	

