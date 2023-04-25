package com.kyaa.jobservice.data.repository;

import com.kyaa.jobservice.data.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepository extends MongoRepository<JobPost, String> {
}
