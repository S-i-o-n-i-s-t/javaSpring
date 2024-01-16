package org.commonsLang3.classArrayUtils.classFraction;

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

    /**
     * add() Сложение дробей
     * @param fraction1
     * @param fraction2
     * @return
     */
    public Fraction metodAdd(Fraction fraction1, Fraction fraction2){
        return fraction1.add(fraction2);
    }

    /**
     * subtract() Вычитание дробей
     * @param fraction1
     * @param fraction2
     * @return
     */
    public Fraction metodSubtract(Fraction fraction1, Fraction fraction2){
        return fraction1.subtract(fraction2);
    }

    /**
     * multiplyBy() умножение дробей
     * @param fraction1
     * @param fraction2
     * @return
     */
    public Fraction metodMultiplyBy(Fraction fraction1, Fraction fraction2){
        return fraction1.multiplyBy(fraction2);
    }

}
