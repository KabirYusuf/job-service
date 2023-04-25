package com.kyaa.jobservice.service.implementation;

import com.kyaa.jobservice.data.dto.request.JobApplicationRequest;
import com.kyaa.jobservice.data.dto.request.PostJobRequest;
import com.kyaa.jobservice.data.dto.response.JobApplicationResponse;
import com.kyaa.jobservice.data.dto.response.PostJobResponse;
import com.kyaa.jobservice.data.model.JobPost;
import com.kyaa.jobservice.data.repository.UserRepository;
import com.kyaa.jobservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public PostJobResponse postJob(PostJobRequest postJobRequest) {
        return null;
    }

    @Override
    public List<JobPost> viewAvailableJobs() {
        return null;
    }

    @Override
    public JobApplicationResponse apply(JobApplicationRequest jobApplicationRequest) {
        return null;
    }

    @Override
    public String deleteJobPost(String jobId) {
        return null;
    }
}
