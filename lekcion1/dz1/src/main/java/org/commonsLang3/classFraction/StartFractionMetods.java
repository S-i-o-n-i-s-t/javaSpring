package org.commonsLang3.classFraction;

import org.apache.commons.lang3.math.Fraction;

// Класс Fraction упрощает сложение, вычитание и умножение дробей :
public class StartFractionMetods {
    public static void main(String[] args) {
        FractionMetods fractionMetods = new FractionMetods();
        Fraction fraction = fractionMetods.metodGetFraction(2, 3);
        System.out.println(fractionMetods.metodGetFraction(2, 3));
    }
}
