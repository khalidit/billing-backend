package com.aliateck.fact.application.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aliateck.fact.domaine.ports.api.UserApiService;
import com.aliateck.fact.infrastructure.models.UserEntity;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserApiService userApiService;

	@GetMapping(value = "/user")	
	public ResponseEntity<UserEntity> getUser(@RequestParam("email") String email, @RequestParam("password") String password)
	{
		userApiService.chercherUtilisateurParId(1);
		return ResponseEntity.ok(null);
		
	}
	
	@GetMapping(value = "/user/{mail}/{password}")	
	public String getPassword(@PathVariable String mail, @PathVariable String password) {	
		
		return null;		
	}

}
