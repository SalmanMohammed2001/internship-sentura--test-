package com.example.demo.controller;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weavy")
public class Controller {



    @PostMapping("/createUser")
    public String createUser(@RequestBody String userJson) {
        OkHttpClient client = new OkHttpClient();


        String createUserEndpoint = "https://your-weavy-cloud-endpoint.com/api/createUser";

        RequestBody requestBody = (RequestBody) okhttp3.RequestBody.create(MediaType.parse("application/json"), userJson);

        Request request = new Request.Builder()
                .url(createUserEndpoint)
                .post((okhttp3.RequestBody) requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                return "Failed to create user in Weavy Cloud";
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }






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
