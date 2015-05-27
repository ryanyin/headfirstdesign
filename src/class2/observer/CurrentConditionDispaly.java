package class2.observer;

import class2.display.DisplayElement;
import class2.subject.Subject;

public class CurrentConditionDispaly extends Observer implements  DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDispaly(Subject weatherData) {
		super();
		super.weatherData=weatherData;
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}


	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}

}
