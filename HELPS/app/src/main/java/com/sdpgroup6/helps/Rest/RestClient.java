package com.sdpgroup6.helps.Rest;

import com.sdpgroup6.helps.Model.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kiman on 25/08/2016.
 */
public class RestClient {
    private APIService apiService;
    public RestClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(APIService.class);
    }

    public APIService getApiService() {
        return apiService;
    }
}
