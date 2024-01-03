package org.commonsLang3.classArrayUtils;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Map;

// Класс ArrayUtils реализует набор служебных методов, позволяющих нам обрабатывать и проверять массивы самых разных форм и форм .
public class ArrayUtilsMetods {
    /**
     * Две перегруженные реализации метода toString() ,
     * которыe возвращает строковое представление заданного массива и конкретную строку , когда массив равен нулю:
     * @param listText
     * @return
     */
    public String metodToString(String[] listText){
        return ArrayUtils.toString(listText);
    }
    public String metodToString(String listText){
        return ArrayUtils.toString(null, listText);
    }
    // Далее у нас есть методы hasCode() и toMap()

    /**
     * Первый генерирует пользовательскую реализацию hashCode для массива, а второй преобразует массив в Map :
     * @param listText
     * @return
     */
    public int metodHashCode(String[] listText){
        return ArrayUtils.hashCode(listText);
    }
    public Map<Object, Object> metodToMap(String[][] listText){
        return ArrayUtils.toMap(listText);
    }
    // рассмотрим методы isSameLength() и indexOf()

    /**
     * используется для проверки того, имеют ли два массива одинаковую длину
     * @param massiv1
     * @param massiv2
     * @return
     * @param <E>
     * @param <T>
     */
    public <E, T> boolean metodIsSameLength(E massiv1, T massiv2){
        return ArrayUtils.isSameLength(massiv1, massiv2);
    }

    /**
     * для получения индекса данного элемента
     * @param massiv
     * @param meaning
     * @return
     * @param <E>
     */
    public <E> int metodIndexOf(E[] massiv,E meaning){
        return ArrayUtils.indexOf(massiv, meaning);
    }
}
