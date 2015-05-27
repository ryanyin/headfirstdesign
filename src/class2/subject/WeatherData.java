package class2.subject;

import java.util.ArrayList;

import class2.observer.Observer;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	public WeatherData() {
		
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		if (observers.contains(o)) {
			System.out.println("已注册！！");
		}
		else observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
		if(i>=0)
			observers.remove(i);
		else
			System.out.println("没有订阅，不能取消订阅");
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChange(){
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChange();
	}
}
