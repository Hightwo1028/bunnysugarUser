package com.example.bunnysugar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String account;
    private String password;
    private String email;
    private String name;
    private String gender;
    private String phone;
    private Date birthday;
    private Double bunnyCoin;
    private String isActive;
    private String verifyingToken;
    private String forgetToken;
    private Integer loginMethod;
    private String googleToken;
    private String facebookToken;
    private Date createTime;
    private Date updateTime;
    private Date lastLoginTime;
    private Date gameTimes;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getBunnyCoin() {
        return bunnyCoin;
    }

    public void setBunnyCoin(Double bunnyCoin) {
        this.bunnyCoin = bunnyCoin;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getVerifyingToken() {
        return verifyingToken;
    }

    public void setVerifyingToken(String verifyingToken) {
        this.verifyingToken = verifyingToken;
    }

    public String getForgetToken() {
        return forgetToken;
    }

    public void setForgetToken(String forgetToken) {
        this.forgetToken = forgetToken;
    }

    public Integer getLoginMethod() {
        return loginMethod;
    }

    public void setLoginMethod(Integer loginMethod) {
        this.loginMethod = loginMethod;
    }

    public String getGoogleToken() {
        return googleToken;
    }

    public void setGoogleToken(String googleToken) {
        this.googleToken = googleToken;
    }

    public String getFacebookToken() {
        return facebookToken;
    }

    public void setFacebookToken(String facebookToken) {
        this.facebookToken = facebookToken;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getGameTimes() {
        return gameTimes;
    }

    public void setGameTimes(Date gameTimes) {
        this.gameTimes = gameTimes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", bunnyCoin=" + bunnyCoin +
                ", isActive='" + isActive + '\'' +
                ", verifyingToken='" + verifyingToken + '\'' +
                ", forgetToken='" + forgetToken + '\'' +
                ", loginMethod=" + loginMethod +
                ", googleToken='" + googleToken + '\'' +
                ", facebookToken='" + facebookToken + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", lastLoginTime=" + lastLoginTime +
                ", gameTimes=" + gameTimes +
                '}';
    }
}
