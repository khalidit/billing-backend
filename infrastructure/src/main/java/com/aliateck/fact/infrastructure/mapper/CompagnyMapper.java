package com.aliateck.fact.infrastructure.mapper;

import com.aliateck.fact.domaine.business.object.Company;
import com.aliateck.fact.infrastructure.models.CompanyEntity;
import org.springframework.stereotype.Component;

@Component
public class CompagnyMapper {

    public CompanyEntity fromDomainToEntity(Company domain) {
        return CompanyEntity.builder()
                .id(domain.getId())
                .rcsName(domain.getRcsName())
                .siret(domain.getSiret())
                .socialReason(domain.getSocialReason())
                .status(domain.getStatus())
                .tvaName(domain.getTvaName())
                .build();
    }

    public Company fromDomainToEntity(CompanyEntity entity) {
        return Company.builder()
                .id(entity.getId())
                .rcsName(entity.getRcsName())
                .siret(entity.getSiret())
                .socialReason(entity.getSocialReason())
                .status(entity.getStatus())
                .tvaName(entity.getTvaName())
                .build();
    }
}
