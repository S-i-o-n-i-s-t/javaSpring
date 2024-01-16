package org.commonsLang3.classStringUtils;
// позволяет нам выполнять ряд операций со строками, безопасных для нулей , которые дополняют/расширяют те, которые предоставляет java.lang.String из коробки .
import org.apache.commons.lang3.StringUtils;
public class StringUtilsMetods {
    // Метод containsAny
    /**
     * Метод containsAny проверяет, содержит ли заданная строка какой-либо символ из заданного набора символов.
     * Этот набор символов может быть передан в виде String или char varargs.
     * @param text
     * @return
     */
    public boolean metodContainsAny(String text){
        boolean result = StringUtils.containsAny(text, "a", "s", "d");
        return result;
    }
    public boolean metodContainsAny(String text, String test){
        boolean result = StringUtils.containsAny(text, test);
        return result;
    }
    // Метод containsIgnoreCase
    /**
     * Метод containsIgnoreCase проверяет, содержит ли данная строка другую строку без учета регистра.
     * @param text
     * @param test
     * @return
     */
    public boolean metodContainsIgnoreCase(String text, String test){
        boolean result = StringUtils.containsIgnoreCase(text, test);
        return result;
    }
    // Метод countMatches
    /**
     * Метод counterMatches подсчитывает, сколько раз символ или подстрока появляется в заданной строке.
     * @param text
     * @param test
     * @return
     */
    public int metodCountMatches (String text, char test){
        int result = StringUtils.countMatches(text, test);
        return result;
    }
    //  Добавление и добавление метода
    /**
     * Методы appendIfMissing и appendIfMissingIgnoreCase добавляют суффикс в конец заданной строки ,
     * если она еще не заканчивается каким-либо из переданных суффиксов с учетом регистра и без учета регистра соответственно.
     * @param text
     * @param test
     * @return
     */
    public String metodAppendIfMissing(String text, String test){
    //    StringUtils.appendIfMissing(text, test);
        StringUtils.appendIfMissingIgnoreCase(text, test); // Без учета регистра символов
        return text;
    }

    /**
     * Точно так же методы prependIfMissing и prependIfMissingIgnoreCase добавляют префикс к началу заданной строки ,
     * если она не начинается ни с одним из переданных префиксов.
     * @param text
     * @param test
     * @return
     */
    public String metodPrependIfMissing(String text, String test){
        StringUtils.prependIfMissing(text, test);
    //    StringUtils.prependIfMissingIgnoreCase(text, test); // Без учета регистра символов
        return text;
    }
    // Метод изменения регистра

    /**
     * Метод swapCase меняет регистр строки, изменяя верхний регистр на нижний и нижний на верхний:
     * @param text
     * @return
     */
    public String metodSwapCase(String text){
        return StringUtils.swapCase(text);
    }

    /**
     * Метод capitalize преобразует первый символ заданной строки в верхний регистр, оставляя все остальные символы без изменений
     * Второй метод, соответственно в нижний
     * @param text
     * @return
     */
    public String metodCapitalize(String text){
        return StringUtils.capitalize(text);
    }
    public String metodUncapitalize(String text){
        return StringUtils.uncapitalize(text);
    }
    // Реверсивный метод

    /**
     * Следующий фрагмент кода переворачивает строку «foreach» и проверяет результат:
     * @param text
     * @return
     */
    public String metodReverse(String text){
        return StringUtils.reverse(text);
    }

    /**
     * При использовании метода reverseDelimited символы меняются местами группами, а не по отдельности:
     * @param text
     * @param test
     * @return
     */
    public String metodReverseDelimited(String text, char test){
        return StringUtils.reverseDelimited(text, test);
    }
    // Метод rotate

    /**
     * Метод rotate() циклически сдвигает символы строки на несколько позиций.
     * Фрагмент кода ниже перемещает все символы строки «foreach» на четыре позиции вправо и проверяет результат:
     * @param text
     * @param num
     * @return
     */
    public String metodRotate(String text, int num){
        return StringUtils.rotate(text, num);
    }
    // Метод разницы
     public String metodDifference(String text, String test){
        return StringUtils.difference(text, test);
     }
}
