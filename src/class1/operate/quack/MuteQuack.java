package class1.operate.quack;

public class MuteQuack implements QuackBehivoir {

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
