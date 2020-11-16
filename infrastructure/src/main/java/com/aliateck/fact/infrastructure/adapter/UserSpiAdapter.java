package com.aliateck.fact.infrastructure.adapter;

import java.util.List;

import com.aliateck.fact.domaine.business.object.User;
import com.aliateck.fact.domaine.ports.spi.UserSpiService;
import com.aliateck.fact.infrastructure.repository.UserJpaRepository;

public class UserSpiAdapter implements UserSpiService{
	
	UserJpaRepository serviceJpaRepository;	
	

	public UserSpiAdapter(UserJpaRepository serRepository) {
		
		this.serviceJpaRepository = serRepository;
	}


	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User getUserById(long id) {
		System.out.println("******************************* : " + id);
		return null;
	}


	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
