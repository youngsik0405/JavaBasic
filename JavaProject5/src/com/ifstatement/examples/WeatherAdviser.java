package com.ifstatement.examples;

public class WeatherAdviser {
	public String provideWeatherAdvisory(int temperature) {

		String result = "";

		if (temperature < 0) {
			result = "It's freezing! Wear a heavy coat.";
			return result;
		} else if (temperature >= 0 && temperature <= 10) {
			result = "It's cold! Bundle up.";
			return result;
		} else if (temperature >= 11 && temperature <= 20) {
			result = "It's cool! A light jacket will do.";
			return result;
		}
		return "It's warm! Enjoy the day.";
	}

}
