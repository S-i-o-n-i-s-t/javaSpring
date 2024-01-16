package org.commonsLang3.classSystemUtils;
//  Иногда нам нужно получить некоторую динамическую информацию о различных свойствах и переменных базовой платформы Java или операционной системы.
//  Apache Commons Lang 3 предоставляет класс SystemUtils для безболезненного выполнения этой задачи .
//  Рассмотрим, например, методы getJavaHome() , getUserHome() и isJavaVersionAtLeast() :

import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;

import java.io.File;

public class SystemUtilsMetods {
    /**
     * getJavaHome() Как я понял, метод выводит файл и путь к файлу, текущей java
     * @return
     */
    public File metodGetJavaHome(){
        return SystemUtils.getJavaHome();
    }

    /**
     * getUserHome() Как я понял, метод выводит файл и путь к файлу, дирректории Admin (root)
     * @return
     */
    public File metodGetUserHome(){
        return SystemUtils.getUserHome();
    }

    /**
     * isJavaVersionAtLeast() Как я понял, отвечат на вопрос, является ли "это" версией java
     * @return
     */
    public boolean metodIsJavaVersionAtLeast(){
        return SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_6);
    }
}