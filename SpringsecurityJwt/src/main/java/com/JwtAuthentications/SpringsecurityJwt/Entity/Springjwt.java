package com.JwtAuthentications.SpringsecurityJwt.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Springjwt {
    @Id
    public String susername;
    public String spassword;
    public String semail;
    public String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public Springjwt() {
    }

    public Springjwt(String susername, String spassword, String semail) {
        this.susername = susername;
        this.spassword = spassword;
        this.semail = semail;






    }
}
