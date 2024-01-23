package com.example.lecture2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList();
    public List<Task> getAllTask(){
        return tasks;
    }

    /**
     * Прочитать по id
     * @param uuid
     * @return
     */
    public Task getTasks(UUID uuid){
        return tasks.stream().filter(r -> r.getUuid().equals(uuid)).findFirst().orElse(null);// findFirst() метод достает первый попавшийся элемент
    }

    /**
     * Метод добавления
     * @return
     */
    public Task addTask(Task task){
        this.tasks.add(task);
        return task;
    }

    /**
     * Метод удаления
     * @param uuid
     */
    public void deleteTask(UUID uuid){
        tasks.removeIf(task -> task.getUuid().equals(uuid));
    }

    /**
     * Метод "обновления" задачи
     * @return
     */
    public Task updateTask(UUID uuid, Task task){
        Task task1 = getTasks(uuid);
        if (task1 != null){
            task1.setDescroption(task.getDescroption());
            task1.setStatus(task.getStatus());
            task1.setName(task.getName());
            task1.setCompletionTime(task.getCompletionTime());
        }
        return task1;
    }
}
