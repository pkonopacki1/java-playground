package com.konopackipio1;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FormatExamples {
    public static void main(String[] args) {
        List<Locale> locales = new ArrayList<>(List.of(Locale.CANADA, Locale.CHINA, Locale.FRANCE, Locale.ITALY, Locale.JAPAN));
        Date now = new Date();
        Float floatValue = 10.35f;
        String someText = "example text";

        for (Locale locale : locales) {
            System.out.println("Locale: " + locale);
            Locale.setDefault(locale);

            // Printing using a concatenated String
            System.out.println("NOT LOCALIZED : " + someText + " : " + floatValue
                    + ": " + now);

            // Localize each element:
            System.out.println("LOCALIZE ELEMENTS : " + someText +
                    " : " + DecimalFormat.getInstance().format(floatValue) + " : " +
                    SimpleDateFormat.getDateInstance().format(now));

            // Printing using format, where %s is for a String variable
            // and %f is for a float
            System.out.format("LOCALIZED 1 :  %s : %f : %tF %n",
                    someText, floatValue, now);

            // Printing using String.format with format specifiers and args
            System.out.println(String.format(
                    "LOCALIZED 2 : %2$s : %1$.2f : %3$tA %3$tB %3$td, %3$tC",
                    floatValue, someText, now));

            // Printing using String returned from MessageFormat.format
            System.out.println(MessageFormat.format(
                    "LOCALIZED 3 : {0} : {1} : {2}",
                    someText, floatValue, now));

            // Printing using String returned from MessageFormat.format
            // Using more specific format specifiers
            System.out.println(MessageFormat.format(
                    "LOCALIZED 4 : {0} : {1, number, currency}" +
                            " : {2, date, short}",
                    someText, floatValue, now));
            new Date();   
        }
    }
    
}
