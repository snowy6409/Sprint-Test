package com.ethan.restfulservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user2")
public class useraccount {
    @Id
    private String UserID;
    @Column(name="UserName")
    private String UserName;
    private String Password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String EmailAddress) {
        this.email = EmailAddress;
    }

    @Column(name="EmailAddress")
    private String email;
    private String Bio;
    private String Sex;
    private String Age;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        this.UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }




    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "user{" + "username='" + UserName + '\'' + ", password='" + Password + '\''
                + ", email='" + email + '\'' + '}';
    }
}
