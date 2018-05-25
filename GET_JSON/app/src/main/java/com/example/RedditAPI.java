package com.example;

import com.example.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


/**
 * Created by User on 5/1/2017.
 */

public interface RedditAPI {

    String BASE_URL = "https://www.reddit.com/";

    @Headers("Content-Type: application/json")
    @GET(".json")
    Call<Feed> getData();


}
