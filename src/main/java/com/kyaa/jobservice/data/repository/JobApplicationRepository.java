package com.kyaa.jobservice.data.repository;

import com.kyaa.jobservice.data.model.JobApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobApplicationRepository extends MongoRepository<JobApplication, String> {
}
