package lesson7_lab5;

public class RubberDuck extends Duck {

	public RubberDuck() {
		// setFlybehaviour(new CannotFly());
		// setQuackbehaviour(new Squeak());
	}

	@Override
	public void fly() {
		System.out.println("cannot fly");
	}

	@Override
	public void quack() {
		System.out.println("squeaking");
	}

	@Override
	public void display() {
		System.out.println("displaying");
	}
}
