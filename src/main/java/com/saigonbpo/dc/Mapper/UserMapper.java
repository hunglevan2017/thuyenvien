package com.saigonbpo.dc.Mapper;

import com.saigonbpo.dc.Model.UserSeagull;

public interface UserMapper {

	UserSeagull findByUserName(String username);


	void update_password(String username, String newPassword);

	void update_last_login(String username);



}
