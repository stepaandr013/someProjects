package com.example.someprojects.apiTests;

public class UserCreation {
    private String name;
    private String job;

    public UserCreation() {
        super();
    }

    public UserCreation(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
