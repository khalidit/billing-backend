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
@Entity(name = "compagny")
public class CompanyEntity {

    @Id
    private Long id;
    private String socialReason;
    private String status;
    private String siret;
    private String rcsName;
    private String tvaName;


}
