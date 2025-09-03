package com.mckproperties.mck_properties.repository;

import com.mckproperties.mck_properties.model.UserProperty;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserPropertyRepository extends MongoRepository<UserProperty,String> {
}
