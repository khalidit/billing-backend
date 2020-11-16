package com.aliateck.fact.domaine.ports.spi;

import java.util.List;

import com.aliateck.fact.domaine.business.object.Company;

public interface CompanySpiService {
	
	
	public void addCompany(Company Company) ;

	public void removeCompany(Company Company);

	public void updateCompany(Company Company);

	public List<Company> getAllCompanys();

	public Company getCompanyById(long id);
	

}
