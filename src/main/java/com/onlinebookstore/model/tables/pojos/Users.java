/*
 * This file is generated by jOOQ.
 */
package com.onlinebookstore.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  username;
    private Boolean enabled;
    private String  password;

    public Users() {}

    public Users(Users value) {
        this.username = value.username;
        this.enabled = value.enabled;
        this.password = value.password;
    }

    public Users(
        String  username,
        Boolean enabled,
        String  password
    ) {
        this.username = username;
        this.enabled = enabled;
        this.password = password;
    }

    /**
     * Getter for <code>onlinebookstore.users.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>onlinebookstore.users.username</code>.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for <code>onlinebookstore.users.enabled</code>.
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for <code>onlinebookstore.users.enabled</code>.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for <code>onlinebookstore.users.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>onlinebookstore.users.password</code>.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(username);
        sb.append(", ").append(enabled);
        sb.append(", ").append(password);

        sb.append(")");
        return sb.toString();
    }
}
