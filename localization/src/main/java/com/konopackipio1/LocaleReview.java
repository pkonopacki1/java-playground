package com.konopackipio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocaleReview 
{
    public static void main( String[] args )
    {
        testAvailableLocales();
        testLocalCreate();
        
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

    private static void testLocalCreate() {
        Locale locale1 = new Locale("pl");
        Locale locale2 = new Locale("pl", "pl");
        System.out.println("One arg constuctor: " + locale1.getDisplayName());
        System.out.println("Two args constuctor: " + locale2.getDisplayName());

        Locale locale3 = new Locale.Builder().setRegion("pt").build();
        System.out.println("Locale from builder: " + locale3.getDisplayName());
    }
}
