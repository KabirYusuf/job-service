package com.kyaa.jobservice.data.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class PostJobRequest {
    private String jobTitle;
    private String jobDescription;
    private Set<String> jobTechnologies = new HashSet<>();
}
