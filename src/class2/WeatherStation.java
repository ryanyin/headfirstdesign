package class2;

import class2.observer.CurrentConditionDispaly;
import class2.observer.ForecastDisplay;
import class2.observer.SatisticDisplay;
import class2.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionDispaly current=new CurrentConditionDispaly(weatherData);
		SatisticDisplay satis=new SatisticDisplay(weatherData);
		ForecastDisplay fore=new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		
		System.out.println("----------");
		current.register();
		satis.remove();
		weatherData.setMeasurements(80, 65, 30.4f);
		fore.remove();
		satis.remove();
		weatherData.setMeasurements(82, 70, 29.2f);
		current.remove();
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
