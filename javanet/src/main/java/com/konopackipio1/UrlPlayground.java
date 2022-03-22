package com.konopackipio1;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class UrlPlayground {

    static String name = "https://pl.wikipedia.org/wiki/Tupaja_okaza%C5%82a";

    public static void main(String[] args) throws MalformedURLException {

        // Creating URL and data that can be retrieved:
        URL url = new URL(name);

        printURLData(url);
        printUrlConnectionData(url);       
        printUrlContent(url); 
    }

    public static void printURLData(URL url) {
        System.out.println("-----URL Data-----");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Port: " + url.getPort());
        System.out.println("Host: " + url.getHost());
        System.out.println("File: " + url.getFile());
        System.out.println("Full address: " + url.toExternalForm());
    }

    public static void printUrlConnectionData(URL url) {
        System.out.println("-----URLConnection Data-----");
        try {
            URLConnection connection = url.openConnection();

            System.out.println("Content type: " + connection.getContentType());
            System.out.println("Expire date: " + connection.getExpiration());
            System.out.println("Last modified: " + new Date(connection.getLastModified()));
            System.out.println("Content length: " + connection.getContentLength());

        } catch (IOException e) {
            System.err.println("Could not open connection with: " + url);
        }
    }

    public static void printUrlContent(URL url) {
        System.out.println("-----URL Content Data-----");
        try {
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();

            int c;
            while((c = inputStream.read()) != -1) { 
                System.out.print((char) c);
            }

            inputStream.close();

        } catch (IOException e) {
            System.err.println("Could not open connection with: " + url);
        }
       
    }
    
}
