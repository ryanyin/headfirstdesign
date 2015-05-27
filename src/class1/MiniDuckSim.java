package class1;

import class1.duck.Duck;
import class1.duck.MallardDuck;
import class1.duck.ModleDuck;
import class1.operate.fly.FlyRocketPower;

public class MiniDuckSim {
	
	public static void main(String[] args) {
		Duck model=new ModleDuck();
		model.display();
		model.perforFly();
		model.perforQuack();
		model.setFlyBehivor(new FlyRocketPower());
		model.perforFly();
	}
}
