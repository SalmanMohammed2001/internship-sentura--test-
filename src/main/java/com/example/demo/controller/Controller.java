package com.example.demo.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weavy")
public class Controller {
    @GetMapping("/getData")
    public String getDataFromWeavy() {
        OkHttpClient client = new OkHttpClient();

        // Replace with your Weavy Cloud endpoint URL
        String weavyEndpoint = "https://e21551da9c4548579344e75c1b8a2682.weavy.io";

        Request request = new Request.Builder()
                .url(weavyEndpoint)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                return "Failed to fetch data from Weavy Cloud";
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
