package com.saigonbpo.dc.Service.Impl;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.saigonbpo.dc.Mapper.UserMapper;
import com.saigonbpo.dc.Model.UserSeagull;

 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private UserMapper userMapper;
 
 

	
	
	@Autowired
	@Qualifier("wsntbPasswordEncoder")
	private PasswordEncoder wsntbPasswordEncoder;
	
	
	// Log
	Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
	

	
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserSeagull user = this.userMapper.findByUserName(userName);
 
        if (user == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
 
        //Roles
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        GrantedAuthority  authority = new SimpleGrantedAuthority("ROLE_" +  user.getPosition() );
        grantList.add(authority);
        
        String passwordMd5 = user.getPassword() == null ? "{MD5}"  : ("{MD5}"  + user.getPassword());
        
        //passwordMd5 = "{MD5}" +"c4ca4238a0b923820dcc509a6f75849b";
        
        UserDetails userDetails = (UserDetails) new User(user.getUsername(),passwordMd5, grantList);
        return userDetails;
    }
 
}