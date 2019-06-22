package com.saigonbpo.dc.Service;

import com.saigonbpo.dc.Model.UserSeagull;


public interface UserService {

	UserSeagull findByUserName(String username);
	
	void update_last_login (String username);
	void update_password (String username,String NewPassword);
	
}
