package com.bridgelabz.greeting;

public class User {

    private String firstName;
    private long id;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}

