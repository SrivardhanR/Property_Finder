package com.mckproperties.mck_properties.repository;

import com.mckproperties.mck_properties.model.UserSavedProperty;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserSavedPropertyRepository extends MongoRepository<UserSavedProperty,String> {

}
