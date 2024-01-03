package org.commonsLang3.classFraction;

import org.apache.commons.lang3.math.Fraction;

// Класс Fraction упрощает сложение, вычитание и умножение дробей :
public class FractionMetods {
    /**
     * getFraction() "Создать" дробь
     * @param x
     * @param y
     * @return
     */
    public Fraction metodGetFraction(int x, int y){
        return Fraction.getFraction(x, y);
    }
}
