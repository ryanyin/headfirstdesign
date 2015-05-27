package class1.duck;

import class1.operate.fly.FlyWithWings;
import class1.operate.quack.Quack;

public class MallardDuck extends Duck {
	
	
	public MallardDuck() {
		super();
		// TODO Auto-generated constructor stub
		quackBehivoir=new Quack();
		flyBehivior=new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mallard Duck!!");
	}

}
