package com.group12.studentassistantconsoleappnb;

import java.util.Objects;

public class User {

    public String username = "null";
    public String password = "null";
    public String firstName = "null";
    public String lastName = "null";
    public String phoneNumber = "null";
    public String emailAddress = "null";

    public User() {

    }

    public User(String username, String password, String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword() {
        this.password = password;
    }

    /**/
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == this.getClass()) {
            User other = (User) obj;
            return ((this.username.equals(other.username)) && (this.password.equals(other.password)) && (this.firstName.equals(other.firstName)) && (this.lastName.equals(other.lastName)) && (this.phoneNumber.equals(other.phoneNumber)) && (this.emailAddress.equals(other.emailAddress)));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.username);
        hash = 53 * hash + Objects.hashCode(this.password);
        hash = 53 * hash + Objects.hashCode(this.firstName);
        hash = 53 * hash + Objects.hashCode(this.lastName);
        hash = 53 * hash + Objects.hashCode(this.phoneNumber);
        hash = 53 * hash + Objects.hashCode(this.emailAddress);
        return hash;
    }

    @Override
    public String toString() {
        return "\nUsername : " + username + "\nPassword : " + "***" + "\nFirst Name : " + firstName + "\nLast Name : " + lastName + "\nPhone Number : " + phoneNumber + "\nEmail Address : " + emailAddress;
    }
}
