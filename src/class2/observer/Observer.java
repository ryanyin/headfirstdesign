package class2.observer;

import class2.subject.Subject;

public  class Observer {
	public Subject weatherData; 
	public  void update(float temp,float humidity,float pressure){};
	public void register(){
		weatherData.registerObserver(this);
	}
	public void remove(){
		weatherData.removeObserver(this);
	}
	
}
