package com.kyaa.jobservice.data.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.kyaa.jobservice.Role;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;
@Getter
@Setter
@Document
public class User {
    @Id
    private String emailAddress;
    private String firstName;
    private String lastName;
    private Set<String> skills;
    @DBRef
    @JsonEnumDefaultValue
    private List<Role> roles;
}
