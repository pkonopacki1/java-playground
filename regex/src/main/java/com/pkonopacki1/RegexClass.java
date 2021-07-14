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

    }


    public static int testRegex(String testString, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        int matches = 0;
        while(matcher.find()) matches++;
        System.out.println("\"" + testString + "\" matches " + regex + " " + matches + " times");
        return matches;
    }
}
