package com.aliateck.fact.domaine.ports.spi;

import java.util.List;

import com.aliateck.fact.domaine.business.object.User;

public interface UserSpiService {	
	
	public void addUser(User user) ;

	public void removeUser(User user);

	public void updateUser(User user);

	public List<User> getAllUsers();

	public User getUserById(long id);
	
	public User getUserByEmailAndPassword(String email, String password);

}
