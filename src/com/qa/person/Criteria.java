package com.qa.person;

import java.util.List;

public interface Criteria {
	
   public List<User> meetCriteria(List<User> users);
}