package com.aliateck.fact.domaine.adapter;

import java.util.List;

import com.aliateck.fact.domaine.ports.api.UserApiService;
import com.aliateck.fact.domaine.business.object.User;
import com.aliateck.fact.domaine.ports.spi.UserSpiService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserApiAdapter implements UserApiService{
	
	UserSpiService userSpiService;

	@Override
	public void ajouterUtilsateur(User user) {
		userSpiService.addUser(user);
		
	}

	@Override
	public void supprimerUtilsateur(User user) {
		userSpiService.removeUser(user);
		
	}

	@Override
	public void mettreAJourUtilisateur(User user) {
		userSpiService.updateUser(user);
		
	}

	@Override
	public List<User> retournerUtilisateurs() {
		return userSpiService.getAllUsers();
	}

	@Override
	public User chercherUtilisateurParId(long id) {
		return userSpiService.getUserById(id);
	}

	@Override
	public User chercherUtilisateurParMailAndPassword(String email, String password) {
		return userSpiService.getUserByEmailAndPassword(email, password);
	}

}
