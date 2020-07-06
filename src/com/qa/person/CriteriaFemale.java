package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

	
	@Override
	   public List<User> meetCriteria(List<User> users) {
	      List<User> femalePersons = new ArrayList<User>(); 
	      
	      for (User user : users) {
	         if(user.getGender().equalsIgnoreCase("FEMALE")){
	            femalePersons.add(user);
	         }
	      }
	      return femalePersons;
	   }
}
