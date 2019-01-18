package com.weAssit.repository;

import java.util.List;

import com.weAssit.entity.UserDetailsEntity;



public interface IUserDetailsDAO {
	
	public List<UserDetailsEntity> getAllUserDetails();
	
	public UserDetailsEntity getUserDetailsById(int userId);
	
	public UserDetailsEntity getUserDetailsByName(int userName);
	
	public void addUserDetails(UserDetailsEntity userDetails);
}
