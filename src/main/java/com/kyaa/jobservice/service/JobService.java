package com.kyaa.jobservice.service;

import com.kyaa.jobservice.data.dto.request.PostJobRequest;
import com.kyaa.jobservice.data.dto.response.PostJobResponse;
import com.kyaa.jobservice.data.model.JobPost;

import java.util.List;

public interface JobService {
    PostJobResponse postJob(PostJobRequest postJobRequest);
    List<JobPost> viewAvailableJobs();

    String deleteJobPost(String jobId);
}
