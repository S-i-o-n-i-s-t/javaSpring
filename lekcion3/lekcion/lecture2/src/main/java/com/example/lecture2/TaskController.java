package com.example.lecture2;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/task")
public class TaskController {
    private TaskService taskService;

    /**
     * Конструктор принимает:
     * @param taskService  поле класса TaskService
     */
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Так как мы не указываем адрес метода, он будет доступен по адресу контроллера (/task)
     * @return
     */
    @GetMapping
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

    /**
     * @PathVariable - аннотация указания пути
     * @param id
     * @return
     */
    @GetMapping("/{id}") // аннотация к чтению
    public Task getById(@PathVariable UUID id){ // назватни переменных id и uuid не совпадают
        return taskService.getTasks(id);
    }

    /**
     *
     * @param task
     * @return
     */
    @PostMapping // аннотация к добавлению задачь
    public Task addById(@RequestBody Task task){ // @RequestBody аннотация к принятию класса,  а не пути
        return taskService.addTask(task);
    }

    /**
     *
     * @param id
     * @param task
     */
    @PutMapping("/{id}") // Аннотация к обновлеию
    public  Task update(@PathVariable UUID id,@RequestBody Task task){
        return taskService.updateTask(id,task);
    }

    /**
     *
     * @param id
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        taskService.deleteTask(id);
    }
}












































