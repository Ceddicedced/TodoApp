package dev.busacker.mytaskapp;

import java.util.Calendar;
import java.util.Date;

public class Task {


    private final Date creation;
    private String name;
    private String description;
    private boolean isCompleted;
    private boolean isFavorite;
    private Date dueDate;

    private int id; // Lokale SQLite ID
    private String firebaseId; // Firebase ID

    // Konstruktor
    public Task(String name, String description, boolean isCompleted, boolean isFavorite, Date dueDate) {
        this.name = name;
        this.description = description;
        this.isCompleted = isCompleted;
        this.isFavorite = isFavorite;
        this.dueDate = dueDate;

        this.creation = Calendar.getInstance().getTime();
    }

    // Getter und Setter für jedes Feld
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Date getCreation() {
        return creation;
    }
}