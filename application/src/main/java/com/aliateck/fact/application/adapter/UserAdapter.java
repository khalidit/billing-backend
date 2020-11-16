package com.aliateck.fact.application.adapter;

import java.util.List;

import com.aliateck.fact.domaine.ports.api.UserApiService;
import com.aliateck.fact.domaine.business.object.User;
import com.aliateck.fact.domaine.adapter.UserBusinessService;
import com.aliateck.fact.domaine.ports.spi.UserSpiService;

public class UserAdapter implements UserApiService {

	private UserBusinessService userBusinessService;

	public UserAdapter(UserSpiService userSpiService) {
		userBusinessService = new UserBusinessService(userSpiService);

	}

	@Override
	public void ajouterUtilsateur(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerUtilsateur(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mettreAJourUtilisateur(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> retournerUtilisateurs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User chercherUtilisateurParId(long id) {
		
		return null;
	}

	@Override
	public User chercherUtilisateurParMailAndPassword(String email, String password) {
		System.out.println("ici ***********************************");
		userBusinessService.accept(new User());
		return null;
	}

}
