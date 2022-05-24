package com.day3Assingnment;

public class CheckWeather {

	public static void main(String[] args) {
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		if(isRaining == true | isSnowing == true) {
			System.out.println("Let’s stay home.");
		}
		if(temperature < 50) {
			System.out.println("Let’s go out!");
		}
	}

}
