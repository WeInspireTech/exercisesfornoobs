package org.mrc.exercises.Lesson2;

public class Employee {
    private int id;
    private String name;
    private boolean isActive;

    public Employee(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
