package class2.observer;

import class2.display.DisplayElement;
import class2.subject.Subject;
import class2.subject.WeatherData;

public class SatisticDisplay extends Observer implements  DisplayElement {
	private Subject weatherData;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	
	public SatisticDisplay(Subject weatherData) {
		super();
		super.weatherData=weatherData;
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		numReadings++;
		tempSum += temp;
		maxTemp=Math.max(maxTemp, temp);
		minTemp=Math.min(minTemp, temp);
		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

}
