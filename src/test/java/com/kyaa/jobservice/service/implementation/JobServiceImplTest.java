package com.kyaa.jobservice.service.implementation;

import com.kyaa.jobservice.data.dto.request.PostJobRequest;
import com.kyaa.jobservice.data.dto.response.PostJobResponse;
import com.kyaa.jobservice.data.repository.JobPostRepository;
import com.kyaa.jobservice.service.JobService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JobServiceImplTest {
    @Autowired
    private JobService jobService;
    @Autowired
    private JobPostRepository jobPostRepository;
    @AfterEach
    void tearDown(){
        jobPostRepository.deleteAll();
    }

    @Test
    void testThatNumberOfAvailableJobsIncreasesByOneWhenANewJobIsPosted(){
        int numOfAvailableJobsBeforePostingAJob = jobService.viewAvailableJobs().size();
        assertEquals(0,numOfAvailableJobsBeforePostingAJob);
        PostJobRequest postJobRequest = new PostJobRequest();
        postJobRequest.setJobTitle("Accountant");
        postJobRequest.setJobDescription("Location: Garki Abuja");
        postJobRequest.getJobTechnologies().add("ICAN");
        jobService.postJob(postJobRequest);
        int numOfAvailableJobsAfterPostingAJob = jobService.viewAvailableJobs().size();
        assertEquals(1, numOfAvailableJobsAfterPostingAJob);
    }
    @Test
    void testThatTheNumberOfAvailableJobsReducesByOneWhenAJobPostIsDeleted(){
        int numOfAvailableJobsBeforePostingAJob = jobService.viewAvailableJobs().size();
        assertEquals(0,numOfAvailableJobsBeforePostingAJob);
        PostJobRequest postJobRequest = new PostJobRequest();
        postJobRequest.setJobTitle("Accountant");
        postJobRequest.setJobDescription("Location: Garki Abuja");
        postJobRequest.getJobTechnologies().add("ICAN");
        PostJobResponse postJobResponse = jobService.postJob(postJobRequest);
        int numOfAvailableJobsAfterPostingAJob = jobService.viewAvailableJobs().size();
        assertEquals(1, numOfAvailableJobsAfterPostingAJob);
        jobService.deleteJobPost(postJobResponse.getJobId());
        int numOfAvailableJobsAfterDeletingAJob = jobService.viewAvailableJobs().size();
        assertEquals(0, numOfAvailableJobsAfterDeletingAJob);
    }

}