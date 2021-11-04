package com.konopackipio1;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FormatExamples {
    public static void main(String[] args) {
        List<Locale> locales = new ArrayList<>(List.of(Locale.CANADA, Locale.CHINA, Locale.FRANCE, Locale.ITALY, Locale.JAPAN));

        for (Locale locale : locales) {
            System.out.println("Locale: " + locale);
            Locale.setDefault(locale);

            System.out.println(MessageFormat.format("{0}", new Date()));            
        }
    }
    
}
