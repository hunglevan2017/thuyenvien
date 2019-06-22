package com.saigonbpo.dc.Model;

public class UserSeagullWithBLOBs extends UserSeagull {
    private String passwordquestion;

    private String comment;

    public String getPasswordquestion() {
        return passwordquestion;
    }

    public void setPasswordquestion(String passwordquestion) {
        this.passwordquestion = passwordquestion;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}