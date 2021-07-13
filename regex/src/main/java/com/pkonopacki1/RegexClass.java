package com.pkonopacki1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class RegexClass 
{
    public static void main( String[] args )
    {

        //. is any character, * is any number of characters
        String regex = "A.*";
        String testString = "Ala ma kota";
        testRegex(testString, regex);





    }


    public static void testRegex(String testString, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        System.out.println("\"" + testString + "\" matches " + regex + ": " + matcher.matches());
    }
}
