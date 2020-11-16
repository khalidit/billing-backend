package com.aliateck.fact.domaine.ports.api;

import java.util.List;

import com.aliateck.fact.domaine.business.object.User;


public interface UserApiService {	
		
	public void ajouterUtilsateur(User user) ;

	public void supprimerUtilsateur(User user);

	public void mettreAJourUtilisateur(User user);

	public List<User> retournerUtilisateurs();

	public User chercherUtilisateurParId(long id);
	
	public User chercherUtilisateurParMailAndPassword(String email, String password);
	

}
