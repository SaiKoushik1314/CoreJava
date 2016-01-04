package com.java.funda;

public class ExceptionExample1 {
	private static void temperatureReport(TemperatureObject tempObj) {
		try {
			tempObj.test();
			System.out.println(tempObj.temperature + " - Perfect Temperature");
		} catch (TooHot e) {
			System.out.println(tempObj.temperature + " - " + e.getMessage());
		} catch (TooCold e) {
			System.out.println(tempObj.temperature + " - " + e.getMessage());
		}

	} // End of temperatureReport

	public static void main(String[] args) {
		temperatureReport(new TemperatureObject(100));
		temperatureReport(new TemperatureObject(50));
		temperatureReport(new TemperatureObject(75));
	} // End of main
} // End of class
