package com.weAssist.model;

import java.io.Serializable;



public class UserDetails implements Serializable {

    private int userId;
    private String userName;
    private String email;
    private String gender;
    private String date_of_birth;
    private String cellNo;
    private String panCard;
    private String aadhar;
    private String disability;

    private int availableCreditPoints;
     private String bankDetails;
     private String accountNo;
      private String password;
      private String confirmPassword;
        private int totalCreditPoints;

    public int getUserId() {
        return this.userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getTotalCreditPoints() {
        return totalCreditPoints;
    }

    public void setTotalCreditPoints(int totalCreditPoints) {
        this.totalCreditPoints = totalCreditPoints;
    }

    public int getAvailableCreditPoints() {
        return availableCreditPoints;
    }

    public void setAvailableCreditPoints(int availableCreditPoints) {
        this.availableCreditPoints = availableCreditPoints;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}