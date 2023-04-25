package com.li.plans.plans_backend.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (PlansUser)实体类
 *
 * @author makejava
 * @since 2023-04-25 16:32:59
 */
public class PlansUser implements Serializable {
    private static final long serialVersionUID = 699232484832115903L;
    
    private Integer userId;
    
    private String usrName;
    
    private String password;
    
    private Date createDate;
    
    private String email;
    
    private String phoneNum;
    
    private String gender;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

