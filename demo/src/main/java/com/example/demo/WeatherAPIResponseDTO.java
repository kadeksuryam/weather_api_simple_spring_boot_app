package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherAPIResponseDTO {
    @JsonProperty("current_weather")
    private CurrentWeather currentWeather;
    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CurrentWeather {
        @JsonProperty("time")
        private String time;
        @JsonProperty("temperature")
        private String temperature;
    }
}
