package com.bca.todolist;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task ORDER BY priorityTask")
    LiveData<List<Task>> loadAllTasks();

    @Insert
    void insertTask(Task taskEntry);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateTask(Task taskEntry);

    @Delete
    void deleteTask(Task taskEntry);

    @Query("SELECT * FROM task WHERE id = :id")
    LiveData<Task> loadTaskById(int id);
}
