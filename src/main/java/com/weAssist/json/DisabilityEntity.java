package com.weAssist.json;


import java.io.Serializable;



public class DisabilityEntity implements Serializable{
    
    private String disability_code;
    
    private String disability_type;


    public String getDisability_code() {
        return this.disability_code;
    }

    public void setDisability_code(String disability_code) {
        this.disability_code = disability_code;
    }

    public String getDisability_type() {
        return this.disability_type;
    }

    public void setDisability_type(String disability_type) {
        this.disability_type = disability_type;
    }

}
