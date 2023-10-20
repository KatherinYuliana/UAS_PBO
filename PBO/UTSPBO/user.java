package UTSPBO;

import java.util.Date;

public class user {
    private String userId;
    private String username;
    private String password;
    private String bio;

    public user (String userId, String username, String password, String bio){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.bio = bio;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    // public String updateProfile(String username, String password, String profileName, Date birthDate, String email, String phoneNumber) {
    //     this.username = username;
    //     this.password = password;
    //     this.profileName = profileName;
    //     this.birthDate = birthDate;
    //     this.profileName = profileName;
    //     this.email = email;
    //     this.phoneNumber = phoneNumber;
    //     return this.username = username;
    // }
}
