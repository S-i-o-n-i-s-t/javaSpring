package org.commonsLang3.classStringUtils;
// позволяет нам выполнять ряд операций со строками, безопасных для нулей , которые дополняют/расширяют те, которые предоставляет java.lang.String из коробки .
public class StartTestStringUtils {
    //https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html - официальная документация
    public static void main(String[] args) {


        String test = "abcd";
        StringUtilsMetods stringUtilsMetods = new StringUtilsMetods();
        System.out.println("containsAny() - Содержит ли строка один из символов? - " + stringUtilsMetods.metodContainsAny(test, "artkj"));
        System.out.println("containsIgnoreCase() - Сравнение строк, без учета регистра - " + stringUtilsMetods.metodContainsIgnoreCase(test, "ABCD"));
        System.out.println("countMatches() - Количество символов (или строк) или строк в тексте - " + stringUtilsMetods.metodCountMatches(test, 'a'));
        String text2 = "metallJAN";
        System.out.println("appendIfMissing() - Добавляет 'суффикс' в конец строки - (не работает) " + stringUtilsMetods.metodAppendIfMissing(text2, ".ru"));
        System.out.println(text2 + " - swapCase() Меняем регистр, получаем - " + stringUtilsMetods.metodSwapCase(text2));
        System.out.println(test + " - capitalize() Делаем первый символ строки верхним регистром, получаем - " + stringUtilsMetods.metodCapitalize(test));
        String test3 = stringUtilsMetods.metodCapitalize(test);
        System.out.println(test3 + " - uncapitalize() Делаем первый символ строки нижним регистром, получаем - " + stringUtilsMetods.metodUncapitalize(test3));
        String text4 = "www.metalljan.ru";
        System.out.println(text4 + " - reverse() Применяем реверс к строке, получаем - " + stringUtilsMetods.metodReverse(text4));
        System.out.println(text4 + " - reverseDelimited() Применяем реверс, переворачивающий строку, с учетом указанного символа - " + stringUtilsMetods.metodReverseDelimited(text4, '.'));
        System.out.println(text2 + " - rotate() Метод переставляет в начало часть строки - " + stringUtilsMetods.metodRotate(text2, 4));
        String text5 = "metalPaAN";
        System.out.println(text2 + " и " + text5 + " - difference() Метод сравнивает строки и получаем ту часть, от куда строка начинает отличаться - " + stringUtilsMetods.metodDifference(text2, text5));

    }
}
