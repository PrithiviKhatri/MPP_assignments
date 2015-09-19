package lesson7_lab5;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		// setFlybehaviour(new CannotFly());
		// setQuackbehaviour(new MuteQuack());
	}

	@Override
	public void fly() {
		System.out.println("cannot fly");
	}
	
	@Override
	public  void quack() {
	System.out.println("cannot quack");	
	}

	@Override
	public void display() {
		System.out.println("displaying");
	}
}
