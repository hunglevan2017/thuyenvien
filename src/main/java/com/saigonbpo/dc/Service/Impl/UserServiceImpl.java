package com.saigonbpo.dc.Service.Impl;



import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saigonbpo.dc.Common.Constants;
import com.saigonbpo.dc.Mapper.UserMapper;

import com.saigonbpo.dc.Model.UserSeagull;
import com.saigonbpo.dc.Service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	


	@Override
	public UserSeagull findByUserName(String username) {
		// TODO Auto-generated method stub
		return userMapper.findByUserName(username);
	}


	boolean isEmptyValue( String value  )
	{
		if( "".equals(value) )
			return true;
		return false;
	}




	@Override
	public void update_last_login(String username) {
		// TODO Auto-generated method stub
		 userMapper.update_last_login(username);
	}

	@Override
	public void update_password(String username, String NewPassword) {
		// TODO Auto-generated method stub
		userMapper.update_password(username,NewPassword);
	}
	
	

	

}
