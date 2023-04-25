package com.kyaa.jobservice.data.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JobApplicationRequest {
    String emailAddress;
    String jobId;
}
