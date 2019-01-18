package com.weAssit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "assistance_table")
public class AssistanceEntity implements Serializable{

    @Column(name="volunteer_id")
    private int volunteer_id;

    @Column(name="help_seeker_id")
    private int help_seeker_id;

    @Column(name="type_of_help")
    private String type_of_help;

    @Column(name="status_of_help")
    private String status_of_help;

    @Column(name="start_time")
    private String start_time;

    @Column(name="end_time")
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