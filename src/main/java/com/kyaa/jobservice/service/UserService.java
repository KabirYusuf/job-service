package com.kyaa.jobservice.service;

import com.kyaa.jobservice.data.dto.request.JobApplicationRequest;
import com.kyaa.jobservice.data.dto.request.PostJobRequest;
import com.kyaa.jobservice.data.dto.response.JobApplicationResponse;
import com.kyaa.jobservice.data.dto.response.PostJobResponse;
import com.kyaa.jobservice.data.model.JobPost;

import java.util.List;

public interface UserService {
    PostJobResponse postJob(PostJobRequest postJobRequest);
    List<JobPost> viewAvailableJobs();
    JobApplicationResponse apply(JobApplicationRequest jobApplicationRequest);
    String deleteJobPost(String jobId);
}
