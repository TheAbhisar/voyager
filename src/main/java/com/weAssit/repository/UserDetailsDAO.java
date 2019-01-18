package com.weAssit.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.weAssist.model.UserDetails;

@Transactional
@Repository
public class UserDetailsDAO implements IUserDetailsDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;

	@Override
	public List<UserDetails> getAllUserDetails() {
		String hql = "FROM UserDetails as user ORDER BY user.userId";
		return (List<UserDetails>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public UserDetails getUserDetailsById(int userId) {
		return entityManager.find(UserDetails.class, userId);		
	}

	@Override
	public UserDetails getUserDetailsByName(int userName) {
		return entityManager.find(UserDetails.class, userName);
	}

	@Override
	public void addUserDetails(UserDetails userDetails) {
		entityManager.persist(userDetails);		
	}	

}