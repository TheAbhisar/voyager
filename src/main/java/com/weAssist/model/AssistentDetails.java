package com.weAssist.model;

public class AssistentDetails {

    private int userId;
    private String assistentName;
    private String latestAvailableTime;
    private String assistentRating;
    private String assistentWorkType;
    private String duration;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAssistentName() {
        return assistentName;
    }

    public void setAssistentName(String assistentName) {
        this.assistentName = assistentName;
    }

    public String getLatestAvailableTime() {
        return latestAvailableTime;
    }

    public void setLatestAvailableTime(String latestAvailableTime) {
        this.latestAvailableTime = latestAvailableTime;
    }

    public String getAssistentRating() {
        return assistentRating;
    }

    public void setAssistentRating(String assistentRating) {
        this.assistentRating = assistentRating;
    }

    public String getAssistentWorkType() {
        return assistentWorkType;
    }

    public void setAssistentWorkType(String assistentWorkType) {
        this.assistentWorkType = assistentWorkType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
