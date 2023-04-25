package com.kyaa.jobservice.service.implementation;

import com.kyaa.jobservice.data.dto.request.PostJobRequest;
import com.kyaa.jobservice.service.JobService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JobServiceImplTest {
    @Autowired
    private JobService jobService;

    @Test
    void testThatNumberOfAvailableJobsIncreasesByOneWhenANewJobIsPosted(){
        int numOfAvailableJobsBeforePostingAJob = jobService.viewAvailableJobs().size();
        assertEquals(0,numOfAvailableJobsBeforePostingAJob);
        PostJobRequest postJobRequest = new PostJobRequest();
        postJobRequest.setJobTitle("Accountant");
        postJobRequest.setJobDescription("ICAN");
        postJobRequest.getJobTechnologies().add("ICAN");
        jobService.postJob(postJobRequest);
        int numOfAvailableJobsAfterPostingAJob = jobService.viewAvailableJobs().size();
        assertEquals(1, numOfAvailableJobsAfterPostingAJob);
    }

}