package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
	
	@Override
	public List<User> meetCriteria(List<User> users) {
		
	      List<User> malePersons = new ArrayList<User>(); 
	      
	      for (User user : users) {
	         if(user.getGender().equalsIgnoreCase("MALE")){
	            malePersons.add(user);
	         }
	      }
	      return malePersons;
	   }

}
