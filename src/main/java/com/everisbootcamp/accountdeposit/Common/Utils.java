package com.everisbootcamp.accountdeposit.Common;

import com.everisbootcamp.accountdeposit.Constants.Constan;
import com.everisbootcamp.accountdeposit.Constants.Enums.YesOrNot;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Utils {

    /**
     * Verifica si una cadena de texto es nula o vacia.
     *
     * @param String
     * @return Boolean
     */
    private static String numberAddZero(Integer value) {
        return value < 10 ? Constan.ZERO.concat(value.toString()) : value.toString();
    }

    /**
     * Verifica si una cadena de texto es nula o vacia.
     *
     * @param String
     * @return Boolean
     */
    public static Boolean StringEmpty(String value) {
        return value.length() == 0 || Objects.isNull(value) || value.isEmpty();
    }

    /**
     * Convertir una cadena de texto(SI/NO) a booleano.
     *
     * @param String
     * @return Boolean
     */
    public static Boolean StringToBoolean(String value) {
        return equalsOrContains(value, YesOrNot.YES.getValue());
    }

    /**
     * Convertir un booleano a una cadena de texto(SI/NO).
     *
     * @param Boolean
     * @return String
     */
    public static String BooleanToString(Boolean value) {
        return value ? YesOrNot.YES.getValue() : YesOrNot.NO.getValue();
    }

    /**
     * Convertir un objeto a un valor booleano.
     *
     * @param Object
     * @return Boolean
     */
    public static Boolean ObjectToBoolean(Object value) {
        return ((Boolean) value).booleanValue();
    }

    /**
     * Comparar si una cadena se parece en lo mas minimo a otra.
     *
     * @param String
     * @param String
     * @return Boolean
     */
    public static Boolean equalsOrContains(String value1, String value2) {
        return value1.toUpperCase().contains(value2.toUpperCase());
    }

    /**
     * Retorna la fecha y hora.
     *
     * @return String
     */
    public static String date() {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        String day = numberAddZero(calendar.get(Calendar.DAY_OF_MONTH)).concat(Constan.SCRIPT);
        String month = numberAddZero(calendar.get(Calendar.MONTH) + 1).concat(Constan.SCRIPT);
        String year = numberAddZero(calendar.get(Calendar.YEAR));

        String hour = Constan.PLUS.concat(numberAddZero(calendar.get(Calendar.HOUR)));
        String minute = Constan.DOUBLE_POINT.concat(numberAddZero(calendar.get(Calendar.MINUTE)));
        String second = Constan.DOUBLE_POINT.concat(numberAddZero(calendar.get(Calendar.SECOND)));

        day = day.concat(month).concat(year).concat(hour).concat(minute).concat(second);

        return day;
    }
}
