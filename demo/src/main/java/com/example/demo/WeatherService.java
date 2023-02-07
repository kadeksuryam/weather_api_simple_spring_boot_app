package com.example.demo;

import java.io.IOException;

public interface WeatherService {
    WeatherResponseDTO getWeather(WeatherRequestDTO requestDTO) throws IOException;
}
