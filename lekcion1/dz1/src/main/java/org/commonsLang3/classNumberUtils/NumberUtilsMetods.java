package org.commonsLang3.classNumberUtils;
// класс предоставляет большое количество служебных методов, предназначенных для обработки и управления числовыми типами .
import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtilsMetods {
    /**
     * метод compare() сравнивает равенство различных примитивов, таких как int и long
     * @param num1
     * @param num2
     * @return
     */
    public int metodCompare(int num1, int num2){
        return NumberUtils.compare(num1, num2);
    }

    /**
     * createNumber() позволяет нам создать числовое представление строки
     * @param text
     * @return
     */
    public Number metodCreateNumber(String text){
        return NumberUtils.createNumber(text);
    }

    /**
     * isDigits() проверяет, состоит ли строка только из цифр
     * @param text
     * @return
     */
    public boolean metodIsDigits(String text){
        return NumberUtils.isDigits(text);
    }

    /**
     * Методы min() и max() - нахождение минимального и максимального значения в массиве
     * @param massiv
     * @return
     */
    public int metodMin(int[] massiv){
        return NumberUtils.min(massiv);
    }

    public int metodMax(int[] massiv){
        return NumberUtils.max(massiv);
    }
}
