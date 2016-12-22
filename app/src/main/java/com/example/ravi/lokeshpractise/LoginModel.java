package com.example.ravi.lokeshpractise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ravi on 13-11-2016.
 */
public class LoginModel {
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("user_id")
    @Expose
    private int UserID;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public Object getPassword() {
        return Password;
    }

    public void setPassword(Object password) {
        Password = password;
    }

    public Object getInput() {
        return Input;
    }

    public void setInput(Object input) {
        Input = input;
    }

    public Object getTyp() {
        return typ;
    }

    public void setTyp(Object typ) {
        this.typ = typ;
    }

    public Object getStatusID() {
        return StatusID;
    }

    public void setStatusID(Object statusID) {
        StatusID = statusID;
    }

    public Object getRoleID() {
        return RoleID;
    }

    public void setRoleID(Object roleID) {
        RoleID = roleID;
    }

    public Object getMessage() {
        return Message;
    }

    public void setMessage(Object message) {
        Message = message;
    }

    public Object getUser() {
        return User;
    }

    public void setUser(Object user) {
        User = user;
    }

    public Object getEmailVerificationlink() {
        return EmailVerificationlink;
    }

    public void setEmailVerificationlink(Object emailVerificationlink) {
        EmailVerificationlink = emailVerificationlink;
    }

    public Object getMobileverification() {
        return Mobileverification;
    }

    public void setMobileverification(Object mobileverification) {
        Mobileverification = mobileverification;
    }

    public Object getVerificationcode() {
        return Verificationcode;
    }

    public void setVerificationcode(Object verificationcode) {
        Verificationcode = verificationcode;
    }

    public Object getEmailverificationtoken() {
        return emailverificationtoken;
    }

    public void setEmailverificationtoken(Object emailverificationtoken) {
        this.emailverificationtoken = emailverificationtoken;
    }

    public Object getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(Object oldpassword) {
        this.oldpassword = oldpassword;
    }

    @SerializedName("user_name")

    @Expose
    private String UserName;

    @SerializedName("email")
    @Expose
    private String Email;

    @SerializedName("phone_no")
    @Expose
    private String PhoneNo;

    @SerializedName("password")
    @Expose
    private Object Password;

    @SerializedName("input")
    @Expose
    private Object Input;



    @SerializedName("typ")
    @Expose
    private Object typ;

    @SerializedName("status_id")
    @Expose
    private Object StatusID;

    @SerializedName("role_id")
    @Expose
    private Object RoleID;

    @SerializedName("message")
    @Expose
    private Object Message;

    @SerializedName("user")
    @Expose
    private Object User;

    @SerializedName("email_verificationlink")
    @Expose
    private Object EmailVerificationlink;

    @SerializedName("mobile_verification")
    @Expose
    private Object Mobileverification;

    @SerializedName("verificationcode")
    @Expose
    private Object Verificationcode;

    @SerializedName("emailverificationtoken")
    @Expose
    private Object emailverificationtoken;

    @SerializedName("oldpassword")
    @Expose
    private Object oldpassword;
}

