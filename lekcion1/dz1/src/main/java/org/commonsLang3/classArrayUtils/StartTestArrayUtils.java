package org.commonsLang3.classArrayUtils;

public class StartTestArrayUtils {
    public static void main(String[] args) {
        //https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html - официальная документация

        String [] listText = {"a","b","c","d"};
        int [] listNum = {1,2,3,4};
        ArrayUtilsMetods arrayUtilsMetods = new ArrayUtilsMetods();
        System.out.println("Метод toString() - " + arrayUtilsMetods.metodToString(listText));
        String [][] listText2 = {{"a", "123"},{"b", "123"},{"c","456"},{"d","456"}};
        System.out.println("hach() - " + arrayUtilsMetods.metodHashCode(listText));
        System.out.println("toMap() Преобразовали массив строк в Map - " + arrayUtilsMetods.metodToMap(listText2));
        System.out.println("sameLength() Проверка, равна ли длинна массивов (вне зависимости от их типов) - " + arrayUtilsMetods.metodIsSameLength(listText, listNum));
        System.out.println("indexOf() Получение индекса элемента - " + arrayUtilsMetods.metodIndexOf(listText, "b"));
    }
}
