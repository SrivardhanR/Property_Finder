package com.mckproperties.mck_properties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyImage {
    @Id
    private String id;
    private String imageUrl;
    private String property_id;
    private String user_id;
}
