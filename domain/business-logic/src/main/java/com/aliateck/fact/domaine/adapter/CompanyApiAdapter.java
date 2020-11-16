package com.aliateck.fact.domaine.adapter;


import com.aliateck.fact.domaine.business.object.Company;
import com.aliateck.fact.domaine.ports.api.CompanyApiService;
import com.aliateck.fact.domaine.ports.spi.CompanySpiService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CompanyApiAdapter implements CompanyApiService {

    CompanySpiService companySpiService;

    @Override
    public void addCompany(Company Company) {

    }

    @Override
    public void removeCompany(Company Company) {

    }

    @Override
    public void updateCompany(Company Company) {

    }

    @Override
    public List<Company> getAllCompanys() {
        return null;
    }

    @Override
    public Company getCompanyById(long id) {
        return null;
    }
}
