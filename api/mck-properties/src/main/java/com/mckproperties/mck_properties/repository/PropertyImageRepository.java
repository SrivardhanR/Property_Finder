package com.mckproperties.mck_properties.repository;

import com.mckproperties.mck_properties.model.PropertyImage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropertyImageRepository extends MongoRepository<PropertyImage,String> {
}
