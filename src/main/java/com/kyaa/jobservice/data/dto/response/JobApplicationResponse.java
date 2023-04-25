package com.kyaa.jobservice.data.dto.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JobApplicationResponse {
    private String userFirstName;
    private String title;
    private String message;
}
