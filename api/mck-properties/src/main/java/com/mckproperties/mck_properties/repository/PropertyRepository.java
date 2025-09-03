package com.mckproperties.mck_properties.repository;

import com.mckproperties.mck_properties.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropertyRepository extends MongoRepository<Property, String> {
}
