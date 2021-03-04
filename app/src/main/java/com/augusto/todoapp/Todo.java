package com.augusto.todoapp;

import java.util.Date;

public class Todo {
    private final String Name;
    private final String Description;
    private final boolean Done;
    private final Date CreatedAt;

    public Todo(String name, String description) {
        this.Name = name;
        this.Description = description;
        this.Done= false;
        this.CreatedAt = new Date();
    }

    public String getName() {
        return this.Name;
    }

    public String getDescription() {
        return this.Description;
    }

    public boolean getDone() {
        return this.Done;
    }

    public Date getCreatedAt() {
        return this.CreatedAt;
    }

    @Override
    public String toString() {
        return this.Name;
    }
}
