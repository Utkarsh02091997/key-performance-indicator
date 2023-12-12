
package com.kpi.performance.entity;

import lombok.Getter;

@Getter
public class KPIPerformance {
    private String id;
    private String user;
    private String openaiApiKey;
    private String plugin;
    private String application;
    private String timestamp;
    private String details;
    private Integer count;
    private String userRequest;
    private String llmGeneratedResponse;
    private String updatedResponseCorrectness;
    private Double correctnessPercentage;
}

