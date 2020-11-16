package com.aliateck.fact.infrastructure.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "user")
public class UserEntity {
	
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	

}
