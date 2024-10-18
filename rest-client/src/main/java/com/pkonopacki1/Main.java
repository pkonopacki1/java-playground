package com.pkonopacki1;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONArray;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/users"))
        .build();

        var response = client.send(request, BodyHandlers.ofString());
        var jsonObject = new JSONArray(response.body());

        System.out.printf("Received %d objects\n", jsonObject.length());
        System.out.println(jsonObject.getJSONObject(1).getString("website"));
    }

}