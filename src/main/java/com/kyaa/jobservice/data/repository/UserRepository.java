package com.kyaa.jobservice.data.repository;

import com.kyaa.jobservice.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
