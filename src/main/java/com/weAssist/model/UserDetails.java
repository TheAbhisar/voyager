package com.weAssist.model;

@Entity
@Table (name = "articles")

public class UserDetails implements Serializable {

    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private int userId;
    
    
    @Columm(name="first_name")
    private String first_name;

    @Columm(name="last_name")
    private String last_name;
    
    @Columm(name="gender")
    private String gender;

    @Columm(name="date_of_birth")
    private String date_of_birth;

    @Columm(name="disability")
    private String disability;

    @Columm(name="volunteer")
    private Sting volunteer;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_of_birth() {
        return this.date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getDisability() {
        return this.disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public Sting getVolunteer() {
        return this.volunteer;
    }

    public void setVolunteer(Sting volunteer) {
        this.volunteer = volunteer;
    }

    

}

public class DisabilityTable implements Serializable{

    @Columm(name="disability_code")
    private String disability_code;

    @Columm(name="disability_Type")
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


public class AssistanceTable implements Serializable{

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