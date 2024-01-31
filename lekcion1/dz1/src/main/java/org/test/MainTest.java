package org.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Task task1 = new Task((long) 1,"test1", TaskStatus.IN_PROGRESS);
        Task task2 = new Task((long) 2,"test2", TaskStatus.COMPLETED);
        Task task3 = new Task((long) 3,"test3", TaskStatus.NOT_STARTED);
        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        File file = new File("gsonTask.json");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(gson.toJson(taskList));
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println(gson.fromJson(fileReader, ArrayList.class));;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
