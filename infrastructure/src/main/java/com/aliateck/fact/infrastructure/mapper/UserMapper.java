package com.aliateck.fact.infrastructure.mapper;

import com.aliateck.fact.domaine.business.object.User;
import com.aliateck.fact.infrastructure.models.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity fromDomainToEntity(User domain) {
        return UserEntity.builder()
                .id(domain.getId())
                .firstName(domain.getFirstName())
                .lastName(domain.getLastName())
                .email(domain.getEmail())
                .build();
    }

    public User fromEntityToDomain(UserEntity entity) {
        return User.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .build();
    }
}
