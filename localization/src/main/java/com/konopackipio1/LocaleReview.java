package com.konopackipio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocaleReview 
{
    public static void main( String[] args )
    {
        testAvailableLocales();
        
    }

    private static void testAvailableLocales() {
        System.out.println("-----TEST AVAILABLE LOCALES-----");

        List<Locale> availableLocales = new ArrayList<>(List.of(Locale.getAvailableLocales()));
        System.out.println("There are: " + availableLocales.size() + " available locales");
        System.out.println("Some pl examples: ");
        availableLocales.stream()
                            .filter((l) -> l.getCountry().equals("PL"))
                            .forEach((l) -> System.out.println(l.getDisplayName()));

        System.out.println("Default locale: " + Locale.getDefault().getDisplayName());
        System.out.println("Default locale in italian: " + Locale.getDefault().getDisplayName(Locale.ITALIAN));

    }
}
