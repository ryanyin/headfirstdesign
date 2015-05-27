package class2.observer;

import class2.display.DisplayElement;
import class2.subject.Subject;

public class ForecastDisplay extends Observer implements  DisplayElement {

	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		super.weatherData=weatherData;
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

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
