package class2.demo2;

import java.util.Observable;
import java.util.Observer;

import class2.display.DisplayElement;

public class ForecastDisplay implements DisplayElement, Observer {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	public ForecastDisplay(Observable observer){
		observer.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weather =(WeatherData) o;
			lastPressure=currentPressure;
			currentPressure=weather.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
