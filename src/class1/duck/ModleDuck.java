package class1.duck;

import class1.operate.fly.FlyNoWay;
import class1.operate.quack.Quack;

public class ModleDuck extends Duck {
	
	public ModleDuck() {
		super();
		// TODO Auto-generated constructor stub
		flyBehivior=new FlyNoWay();
		quackBehivoir=new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a modle Duck!!!");
	}

}
