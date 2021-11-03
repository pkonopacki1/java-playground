package com.konopackipio1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ioFundamentals 
{
    public static void main( String[] args ) throws IOException
    {
        Console console;
        String name;
        Boolean useConsole = true;
        
        // Console example
        if(useConsole && (console = System.console()) != null)  {
            console.writer().println("Console works fine");

            console.flush();
            name = console.readLine("What is your name?\n");
            console.writer().println("Hi " + name);   
            
            console.writer().println("Provide password:");
            console.flush();
            char[] password = console.readPassword();
            console.writer().println(password);
        } else {
            System.out.println("Using System standard i/o");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("What is your name?");
            name = reader.readLine();

            System.out.println("Hi " + name);
        }


    }
}
