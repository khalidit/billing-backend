package com.aliateck.fact.infrastructure.adapter;

import java.util.List;

import com.aliateck.fact.domaine.business.object.Company;
import com.aliateck.fact.domaine.ports.spi.CompanySpiService;
import com.aliateck.fact.infrastructure.mapper.CompagnyMapper;
import com.aliateck.fact.infrastructure.models.CompanyEntity;
import com.aliateck.fact.infrastructure.repository.CompanyJpaRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CompanySpiAdapter implements CompanySpiService{

	CompanyJpaRepository repository;
	CompagnyMapper mapper;

	@Override
	public void addCompany(Company company) {
		CompanyEntity entity = mapper.fromDomainToEntity(company);
		repository.save(entity);
	}

	@Override
	public void removeCompany(Company Company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompany(Company Company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Company> getAllCompanys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company getCompanyById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
