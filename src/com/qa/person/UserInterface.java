package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {
	
	private int counter = 0;
	
	List<User> userArray = new ArrayList<>();
	
	public void addUser(User user) {
		userArray.add(user);
		counter ++;
		user.setId(counter);
	}
	
public void removeUser(int userId) {
		
		for(User user : userArray) {

			if (userId == user.getId()) {
				userId  = user.getId();
				userArray.remove(userId);
				System.out.println("Removing " + user.getName() + " Thank you, come again!");
				break;
			}
	
		}	
	}
	

}
