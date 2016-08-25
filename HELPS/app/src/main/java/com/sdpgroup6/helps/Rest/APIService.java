package com.sdpgroup6.helps.Rest;

import com.sdpgroup6.helps.Model.Workshop;
import com.sdpgroup6.helps.Model.WorkshopResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by kiman on 23/08/2016.
 */
public interface APIService {

    @GET("api/workshop/workshopsets")
    Call<WorkshopResponse> getWorkshops(@Header("Appkey") String appkey, @Header("Content-Type") String contenttype);
}




