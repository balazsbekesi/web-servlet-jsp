package com.epam.training.model;

public class User {

    private String username;

    private boolean admin;

    public User(String username, boolean admin) {
        this.username = username;
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getUsername() {
        return username;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
