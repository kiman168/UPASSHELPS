package com.sdpgroup6.helps;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by kiman on 23/08/2016.
 */
public interface WorkshopsAPI {

    @GET("/api/workshop/workshopSets")
    Call<Workshops> getWorkshops(@Header("Appkey") String appkey, @Header("Content-Type") String contenttype);
}




