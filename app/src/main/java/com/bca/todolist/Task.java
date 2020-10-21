package com.bca.todolist;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task")
public class Task {

    @PrimaryKey(autoGenerate = true)
    int id;
    String nameTask;
    @ColumnInfo(name = "date_task")
    Date dateTask;
    int priorityTask;

    @Ignore
    public Task(String nameTask, int priorityTask, Date dateTask){
        this.nameTask = nameTask;
        this.dateTask = dateTask;
        this.priorityTask = priorityTask;
    }

    public Task(int id, String nameTask, Date dateTask, int priorityTask){
        this.id = id;
        this.nameTask = nameTask;
        this.dateTask = dateTask;
        this.priorityTask = priorityTask;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public Date getDateTask() {
        return dateTask;
    }

    public void setDateTask(Date dateTask) {
        this.dateTask = dateTask;
    }

    public int getPriorityTask() {
        return priorityTask;
    }

    public void setPriorityTask(int priorityTask) {
        this.priorityTask = priorityTask;
    }
}
