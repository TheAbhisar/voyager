package com.weAssist.json;

import java.io.Serializable;



public class AssistanceEntity implements Serializable{

   
    private int volunteer_id;

    
    private int help_seeker_id;

    
    private String type_of_help;

    
    private String status_of_help;

    
    private String start_time;

    
    private String end_time;


    public int getVolunteer_id() {
        return this.volunteer_id;
    }

    public void setVolunteer_id(int volunteer_id) {
        this.volunteer_id = volunteer_id;
    }

    public int getHelp_seeker_id() {
        return this.help_seeker_id;
    }

    public void setHelp_seeker_id(int help_seeker_id) {
        this.help_seeker_id = help_seeker_id;
    }

    public String getType_of_help() {
        return this.type_of_help;
    }

    public void setType_of_help(String type_of_help) {
        this.type_of_help = type_of_help;
    }

    public String getStatus_of_help() {
        return this.status_of_help;
    }

    public void setStatus_of_help(String status_of_help) {
        this.status_of_help = status_of_help;
    }

    public String getStart_time() {
        return this.start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return this.end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }    
}