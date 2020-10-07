package com;

public class UserSettingService {
	
		public void changeEmail(String user) { 
			System.out.println("Username :"+ user);
			if (SecurityService.checkAccess(user)) {
	             System.out.println("Authorized user");
			}
			else {
				System.out.println("UnAuthorized user--->you are not allowed to access");
			}

		}
	}
