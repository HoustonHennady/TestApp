package com.example.myapplication;

public class Note {
    private String name;
    private String description;
    private int priority;

    public Note() {}

    public Note(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() { return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
