package com.aliateck.fact.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliateck.fact.infrastructure.models.UserEntity;


@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long>{
	

	UserEntity findByEmail(String email);
	
	UserEntity findByName(String name);


}
