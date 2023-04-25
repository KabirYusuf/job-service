package com.kyaa.jobservice.service.implementation;

import com.kyaa.jobservice.data.dto.request.PostJobRequest;
import com.kyaa.jobservice.data.dto.response.PostJobResponse;
import com.kyaa.jobservice.data.model.JobPost;
import com.kyaa.jobservice.data.repository.JobPostRepository;
import com.kyaa.jobservice.service.JobService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class JobServiceImpl implements JobService {
    private final JobPostRepository jobPostRepository;

    @Override
    public PostJobResponse postJob(PostJobRequest postJobRequest) {
        JobPost jobPost = new JobPost();
        jobPost.setTitle(postJobRequest.getJobTitle());
        jobPost.setDescription(postJobRequest.getJobDescription());
        jobPost.setTechnologies(postJobRequest.getJobTechnologies());
        JobPost postedJob = jobPostRepository.save(jobPost);
        PostJobResponse postJobResponse = new PostJobResponse();
        postJobResponse.setJobId(postedJob.getId());
        postJobResponse.setMessage("Job posted successfully");
        return postJobResponse;
    }

    @Override
    public List<JobPost> viewAvailableJobs() {
        return jobPostRepository.findAll();
    }
}
