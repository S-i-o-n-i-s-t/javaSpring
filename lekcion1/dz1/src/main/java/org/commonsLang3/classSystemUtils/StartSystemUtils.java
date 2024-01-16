package org.commonsLang3.classSystemUtils;

public class StartSystemUtils {
    //https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html - официальная документация
    public static void main(String[] args) {
        SystemUtilsMetods systemUtilsMetods = new SystemUtilsMetods();
        System.out.println("getJavaHome() Как я понял, метод выводит файл и путь к файлу, текущей java - " + systemUtilsMetods.metodGetJavaHome());
        System.out.println("getUserHome() Как я понял, метод выводит файл и путь к файлу, дирректории Admin (root)" + systemUtilsMetods.metodGetUserHome());
        System.out.println("isJavaVersionAtLeast() Как я понял, отвечат на вопрос, является ли 'это' версией java " + systemUtilsMetods.metodIsJavaVersionAtLeast());
    }
}
















