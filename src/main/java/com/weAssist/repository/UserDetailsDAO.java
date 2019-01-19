/*package com.weAssist.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.weAssist.entity.UserDetailsEntity;



@Transactional
@Repository
public class UserDetailsDAO implements IUserDetailsDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;

	@Override
	public List<UserDetailsEntity> getAllUserDetails() {
		String hql = "FROM UserDetails as user ORDER BY user.userId";
		return (List<UserDetailsEntity>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public UserDetailsEntity getUserDetailsById(int userId) {
		return entityManager.find(UserDetailsEntity.class, userId);		
	}

	@Override
	public UserDetailsEntity getUserDetailsByName(int userName) {
		return entityManager.find(UserDetailsEntity.class, userName);
	}

	@Override
	public void addUserDetails(UserDetailsEntity userDetails) {
		entityManager.persist(userDetails);		
	}	

}*/