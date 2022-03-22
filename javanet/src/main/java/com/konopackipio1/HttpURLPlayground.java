package com.konopackipio1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpURLPlayground {

    static String name = "https://www.google.com";

    public static void main(String[] args) throws IOException {
        URL url = new URL(name);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        printHttpUrlConnectionData(connection);    
        printHttpUrlConnectionResponse(url);   
        
    }

    public static void printHttpUrlConnectionData(HttpURLConnection connection) throws IOException {
        System.out.println("Metoda zadania: " + connection.getRequestMethod());
        System.out.println("Komunikat odpowiedzi: " + connection.getResponseCode());
    }

    public static void printHttpUrlConnectionResponse(URL url) throws IOException {
        
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        if(connection.getResponseCode() != 200) {
            return;
        }

        String response = "";
        Scanner scanner = new Scanner(url.openStream());

        while(scanner.hasNext()) {
            response += scanner.nextLine();
        }

        System.out.println(response);       
        
    }
    
}
