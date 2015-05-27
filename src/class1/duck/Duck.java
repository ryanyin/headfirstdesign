package class1.duck;

import class1.operate.fly.FlyBehavior;
import class1.operate.quack.QuackBehivoir;

public abstract class Duck {
	FlyBehavior flyBehivior;
	QuackBehivoir quackBehivoir;
	public abstract void display();
	public void perforFly(){
		flyBehivior.fly();
	}
	public void perforQuack(){
		quackBehivoir.quack();
	}
	public void swim() {
		System.out.println("all duck can swim!!");
	}
	public void setFlyBehivor(FlyBehavior fb){
		flyBehivior=fb;
	}
	public void setQuackBehivor(QuackBehivoir qb){
		quackBehivoir=qb;
	}
}
