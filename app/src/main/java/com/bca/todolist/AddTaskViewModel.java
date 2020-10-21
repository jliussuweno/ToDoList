package com.bca.todolist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class AddTaskViewModel extends ViewModel {

    private LiveData<Task> task;

    public AddTaskViewModel(ApplicationDB database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }

    public LiveData<Task> getTask() {
        return task;
    }
}
