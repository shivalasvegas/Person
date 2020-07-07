package com.qa.person;

public class PersonRunner {

	public static void main(String[] args) {
	
		UserInterface frank = new UserInterface();
		
		frank.addUser(new Customer(00, "Shirley Bart", "female"));
		frank.addUser(new Customer(00, "Ash Spirl", "Male"));
		
		frank.addUser(new Staff ());
		
		
		Criteria male = new CriteriaMale();
	    Criteria female = new CriteriaFemale();
	    
//	    System.out.println("Males: ");
//	    printUser(male.meetCriteria());
//
//	    System.out.println("\nFemales: ");
//	    printUser(female.meetCriteria());
//		
				

	}

}
