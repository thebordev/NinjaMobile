package com.example.ninjaapp.Fragments;

import com.example.ninjaapp.Notifications.MyResponse;
import com.example.ninjaapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAzSVfCf0:APA91bEjri_h0zfQrOLYp9rOwt8j_A5XfPp4W91Iyct-h1Gx5k7Mnlr_Fywl8CCoBRDE29r2jXvk7sPSF512GWJEM5R8djXd46QqPrl0DHglS0F6hAhIJ-JiG3RMU8bngqvDYvyNtlBb"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
