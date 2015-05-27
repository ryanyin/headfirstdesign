package class2.demo2;

import java.util.Observable;
import java.util.Observer;

import class2.display.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	 private Observable observable;
	 private float temperature;
	 private float humidity;
	 
	public CurrentConditionsDisplay(Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weather=(WeatherData)o;
			this.temperature=weather.getTemperature();
			this.humidity=weather.getHumidity();
			display();
		}
	}

}
