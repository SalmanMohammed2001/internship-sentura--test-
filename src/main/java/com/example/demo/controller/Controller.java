package com.example.demo.controller;

import com.example.demo.dto.Data;
import okhttp3.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

import static org.apache.el.lang.ELArithmetic.add;

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

    @PostMapping("/createUser")
    public String createUser() {
        OkHttpClient client = new OkHttpClient();


        String createUserEndpoint = "https://e21551da9c4548579344e75c1b8a2682.weavy.io";




        FormBody formBody = new FormBody.Builder()
                .add("username", "test")
                .add("password", "test")
                .build();
 /*       RequestBody requestBody = (RequestBody) okhttp3.RequestBody.create(MediaType.parse("application/json"), userJson);
        Request request = new Request.Builder()
                .url(createUserEndpoint)
                .post((okhttp3.RequestBody) requestBody)
                .build();
*/
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


    @PutMapping("/updateUser/{userId}")
    public String updateUser(@PathVariable Long userId, @RequestBody String updatedUserData) {
        OkHttpClient client = new OkHttpClient();


        String updateUserEndpoint = "https://e21551da9c4548579344e75c1b8a2682.weavy.io" + userId;

        RequestBody requestBody = (RequestBody) okhttp3.RequestBody.create(MediaType.parse("application/json"), updatedUserData);
        Request request = new Request.Builder()
                .url(updateUserEndpoint)
                .put((okhttp3.RequestBody) requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                return "Failed to update user in Weavy Cloud";
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }


}
