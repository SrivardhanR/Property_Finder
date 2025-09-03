package com.mckproperties.mck_properties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProperty {
    @Id
    private String id;
    private String user_id;
    private String property_id;
    private ListedBy listedBy;
    @CreatedDate
    private Instant createdAt;
}
