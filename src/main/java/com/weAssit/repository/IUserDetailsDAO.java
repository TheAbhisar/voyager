package com.weAssit.repository;

import java.util.List;

import com.weAssist.model.UserDetails;

public interface IUserDetailsDAO {
	
	public List<UserDetails> getAllUserDetails();
	
	public UserDetails getUserDetailsById(int userId);
	
	public UserDetails getUserDetailsByName(int userName);
	
	public void addUserDetails(UserDetails userDetails);
}
