package Modul5;

import java.util.Date;

public class User {

    private String username;
    private String password;
    private String profileName;
    private Date birthDate;
    private String email;
    private String phoneNumber;

    public User(String username, String password, String profileName, Date birthDate, String email,
            String phoneNumber) {
        this.username = username;
        this.password = password;
        this.profileName = profileName;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getName() {
        return profileName;
    }

    public void setName(String profileName) {
        this.profileName = profileName;
    }

    public Date getBirth() {
        return birthDate;
    }

    public void setBirth(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String updateProfile(String username, String password, String profileName, Date birthDate, String email,
            String phoneNumber) {
        this.username = username;
        this.password = password;
        this.profileName = profileName;
        this.birthDate = birthDate;
        this.profileName = profileName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        return this.username = username;
    }

    public void addSentMessage(Message message) {
    }
}
