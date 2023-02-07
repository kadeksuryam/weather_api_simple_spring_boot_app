package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponseDTO {
    @JsonProperty("temperature_in_celcius")
    private String temperatureInCelcius;
    @JsonProperty("temperature_in_fahrenheit")
    private String temperatureInFahrenheit;
}
