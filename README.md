# weather-forecast-api

# Task

1. Create a weather forecast api that will retrieve current weather in a certain place
2. API parameter include latitude and longitude of the place
3. API response will be:
  a. Current weather temperature in celcius and fahrenheit
  b. Type of the weather. If temperature is <= 18°C return "Cold". If temperature  is >= 19°C and <= 30°C return "Warm". If temperature is >= 31°C return "Hot"
  
Example response:
```json
{
	"temperature_in_celicus": "19°C",
	"temperature_in_fahrenheit": "66.2°C",
  "type": "Warm"
}
```

For weather API, use https://open-meteo.com/
  
