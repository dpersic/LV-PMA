package com.example.studnetsinfo;
import retrofit2.Call;
import retrofit2.http.GET;


public interface APIInterface {

    @GET("/v1/courses")
    Call<CourseResponse> getCourses();
}
