package com.kyaa.jobservice.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;
@Setter
@Getter
@Document
public class JobPost {
    @Id
    private String id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime expireAt;
    private Set<String> technologies;
}
