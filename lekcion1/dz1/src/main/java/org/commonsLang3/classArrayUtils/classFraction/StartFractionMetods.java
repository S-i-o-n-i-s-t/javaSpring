package org.commonsLang3.classArrayUtils.classFraction;

import org.apache.commons.lang3.math.Fraction;

// Класс Fraction упрощает сложение, вычитание и умножение дробей :
public class StartFractionMetods {
    //https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html - официальная документация
    public static void main(String[] args) {
        FractionMetods fractionMetods = new FractionMetods();
        System.out.println("getFraction() 'преобразовать в дробь' - " + fractionMetods.metodGetFraction(2, 3));
        Fraction fraction1 = fractionMetods.metodGetFraction(3, 3);
        Fraction fraction2 = fractionMetods.metodGetFraction(2, 3);
        System.out.println("add() сложение дробей - " + fractionMetods.metodAdd(fraction1, fraction2));
        System.out.println("subtract() вычитание дробей - " + fractionMetods.metodSubtract(fraction1, fraction2));
        System.out.println("multiplyBy() умножение дробей - " + fractionMetods.metodMultiplyBy(fraction1, fraction2));

    }
}
