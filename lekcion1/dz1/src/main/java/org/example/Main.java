package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
//  Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
//  Задание:
//            1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
//            2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
//            3. Создайте класс Person с полями firstName, lastName и age.
//            4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
    public static void main(String[] args) throws UnsupportedEncodingException {
        Person person = new Person("Игорь", "Игоревич", 30);
        Person person2 = new Person("Олег", "Олегович", 25);
        Person person3 = new Person("Игорь", "Игоревич", 30);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        System.out.println("Использем библиотеку commons-lang3 для генерации метода toString и получаем - " + ArrayUtils.toString(null, person.toString()));
        String[] listText = {person.getFirstName(),person.getLastName(),String.valueOf(person.getAge())};
        System.out.println("Вторая реализация метода toString и получаем - " + ArrayUtils.toString(listText));
        System.out.println("Использем библиотеку commons-lang3 для генерации метода equals и получаем - " + StringUtils.equals(person.toString(), person3.toString()));
        // https://for-each.dev/lessons/b/-java-hashcode про hashCode
        System.out.println("Использем библиотеку commons-lang3 для генерации метода hashCode и получаем - " + ArrayUtils.hashCode(person));
//      5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
        File file = new File("gsonTest.json");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(gson.toJson(personList));
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










