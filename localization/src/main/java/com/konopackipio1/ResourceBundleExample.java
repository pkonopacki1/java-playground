package com.konopackipio1;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        // In case of pl, we have another resource clas (firstBundle_pl) which goes first, before .properites file  
        testLocale(new Locale("pl"));
        testLocale(new Locale("pt")); 

    }    

    private static void testLocale(Locale locale) {
        // For maven, resources need to be in sr/main/resources
        ResourceBundle resourceBundle = ResourceBundle.getBundle("firstBundle", locale);

        System.out.println("Resource class: " + resourceBundle.getClass().getName());
        System.out.println("Got bundle: " + resourceBundle.getLocale() + " " + resourceBundle.getBaseBundleName());
        System.out.println("yes: " + resourceBundle.getString("yes"));
        System.out.println("no: " + resourceBundle.getString("no"));
        System.out.println("thank you: " + resourceBundle.getString("thank_you"));
    }
}
