package com;

public class SecurityService {

	public static boolean checkAccess(String user)
	{   
		System.out.println("UserName :" + user);
		String userName ="teja";
		
		if ( user.equalsIgnoreCase(userName)) {
			
			return true;
		}
		else {
			return false;
		}
		
	
	}
	
}