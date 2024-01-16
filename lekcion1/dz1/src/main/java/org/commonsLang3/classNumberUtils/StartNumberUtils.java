package org.commonsLang3.classNumberUtils;
// класс предоставляет большое количество служебных методов, предназначенных для обработки и управления числовыми типами .
public class StartNumberUtils {
    //https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html - официальная документация
    public static void main(String[] args) {
        NumberUtilsMetods numberUtilsMetods = new NumberUtilsMetods();
        System.out.println("compare() Метод сравнивает два числа - " + numberUtilsMetods.metodCompare(12, 12));
        System.out.println("createNumber() Метод преобразует строку в число - " + numberUtilsMetods.metodCreateNumber("123.45"));
        System.out.println("isDigits() Метод проверяет, является ли строка числом - " + numberUtilsMetods.metodIsDigits("12345"));
        String[] text = {"a","b","c","d"};
        int[] num = {1,2,3,4};
        System.out.println("Методы min() и max() - нахождение минимального и максимального значения в массиве - " + numberUtilsMetods.metodMin(num));
    }


}
