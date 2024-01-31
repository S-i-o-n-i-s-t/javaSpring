package com.example.test_1.controller;

import com.example.test_1.domain.Task;
import com.example.test_1.domain.TaskStatus;
import com.example.test_1.repository.RepositiryTask;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/task")
public class Controller {
    @Autowired
    private RepositiryTask repositiryTask;
    @PostMapping("/create")
    public Task createTask(@RequestBody Task task){
        task.setDateOfCreatoin(LocalDateTime.now());
        return repositiryTask.save(task);
    }
    @GetMapping("/getTasks")
    public List<Task> getAllTasks(){
        return repositiryTask.findAll();
    }
    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable TaskStatus status){
        return repositiryTask.findByStatus(status);
    }
//      Изменение статуса задачи. Подсказка метод в контроллере:
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){
        Task existTask = repositiryTask.findById(id).orElse(null);
        if (existTask != null){
            existTask.setStatus(task.getStatus());
            return repositiryTask.save(existTask);
        }
        return null;
    }
//    @PutMapping("/{id}")
//    public Task updateTask(@PathVariable Long id, @RequestBody Task task){
//        repositiryTask.getReferenceById(id).setDescription(task.getDescription());
//        repositiryTask.getReferenceById(id).setStatus(task.getStatus());
//        repositiryTask.getReferenceById(id).setDateOfCreatoin(LocalDateTime.now());
//        return repositiryTask.getReferenceById(id);
//    }
//		Удаление задачи.Подсказка метод в контроллере:
    @DeleteMapping("/{id}")public void deleteTask(@PathVariable Long id){
        repositiryTask.deleteById(id);
    }

}
