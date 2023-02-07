package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

@Service
public class WeatherServiceImpl  implements  WeatherService {
    @Override
    public WeatherResponseDTO getWeather(WeatherRequestDTO requestDTO) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.open-meteo.com/v1/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        WeatherAPI weatherApi = retrofit.create(WeatherAPI.class);
        Call<WeatherAPIResponseDTO> callCel =
                weatherApi.getWeather(requestDTO.getLatitude(), requestDTO.getLongitude(), "celsius", true);
        Call<WeatherAPIResponseDTO> callFah =
                weatherApi.getWeather(requestDTO.getLatitude(), requestDTO.getLongitude(), "fahrenheit", true);


        WeatherAPIResponseDTO celciusRes = callCel.execute().body();
        WeatherAPIResponseDTO fahRes = callFah.execute().body();


        WeatherResponseDTO responseDTO = new WeatherResponseDTO();
        responseDTO.setTemperatureInCelcius(celciusRes.getCurrentWeather().getTemperature());
        responseDTO.setTemperatureInFahrenheit(fahRes.getCurrentWeather().getTemperature());

        return responseDTO;

    }
}
