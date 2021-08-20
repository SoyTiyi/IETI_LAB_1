package edu.eci.project.data;

import java.util.concurrent.atomic.AtomicInteger;


public class User {
    private AtomicInteger id;
    private String name;
    private String email;
    private String lastName;
    private boolean created;

    public User(){

    }

    public User(String name, String email, String lastName, boolean created){
        setName(name);
        setEmail(email);
        setLastName(lastName);
        setCreated(created);
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public AtomicInteger getId() {
        return id;
    }

    public void setId(AtomicInteger id) {
        this.id = id;
    }
}
