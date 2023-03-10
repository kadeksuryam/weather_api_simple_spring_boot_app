package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @PostMapping("/weather")
    public WeatherResponseDTO getWeather(@RequestBody WeatherRequestDTO requestDTO) throws IOException {
        return weatherService.getWeather(requestDTO);
    }
}
