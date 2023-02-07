package com.example.demo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {
    @GET("forecast")
    Call<WeatherAPIResponseDTO> getWeather(@Query("latitude") Float latitude,
                                           @Query("longitude") Float longitude,
                                            @Query("temperature_unit") String temperatureUnit,
                                           @Query("current_weather") Boolean currentWeather);
}
