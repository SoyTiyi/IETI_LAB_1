package edu.eci.project.dto;

public class UserDto {
    private String name;
    private String email;
    private String lastName;
    private boolean created;

    public UserDto(){

    }

    public UserDto(String name, String email, String lastName, boolean created){
        setName(name);
        setEmail(email);
        setLastName(lastName);
        setCreated(created);
    }

    public String getName() {
        return name;
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
    public void setName(String name) {
        this.name = name;
    }
}
