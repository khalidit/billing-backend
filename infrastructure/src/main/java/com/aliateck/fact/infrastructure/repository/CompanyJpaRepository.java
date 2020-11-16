package com.aliateck.fact.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliateck.fact.infrastructure.models.CompanyEntity;


@Repository
public interface CompanyJpaRepository extends JpaRepository<CompanyEntity, Long>{
}
