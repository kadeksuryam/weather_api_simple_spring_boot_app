# weather-forecast-api

# Task

1. Create a weather forecast api that will retrieve current weather in a certain place
2. API parameter include latitude and longitude of the place
3. API response will be:
  a. Current weather temperature in celcius and fahrenheit
  b. Type of the weather. If temperature is <= 18°C return "Cold". If temperature  is >= 19°C and <= 30°C return "Warm". If temperature is >= 31°C return "Hot"

Example request:
```json
{
	"latitude": -8.112,
	"longitude": 115.08818,
}
```

Example response:
```json
{
	"temperature_in_celicus": "19°C",
	"temperature_in_fahrenheit": "66.2°C",
  	"type": "Warm"
}
```

For weather API, use https://open-meteo.com/


# Answer
## How to run the app
1. execute: ```cd demo```
2. execute: ```./gradlew clean runBoot```
3. example HTTP request: 
```
curl -H 'Content-Type: application/json' -d '{"latitude": -8.112, "longitude": 115.08818}' -X POST http://localhost:8080/weather
```