package lesson7_lab5;

abstract public class Duck implements FlyBehaviour,QuackBehaviour {
//	FlyBehaviour flybehaviour;
//	QuackBehaviour quackbehaviour;
//
//	public FlyBehaviour getFlybehaviour() {
//		return flybehaviour;
//	}
//
//	public void setFlybehaviour(FlyBehaviour flybehaviour) {
//		this.flybehaviour = flybehaviour;
//	}
//
//	public QuackBehaviour getQuackbehaviour() {
//		return quackbehaviour;
//	}
//
//	public void setQuackbehaviour(QuackBehaviour quackbehaviour) {
//		this.quackbehaviour = quackbehaviour;
//	}
//
//	void quack() {
//		quackbehaviour.quack();
//	}

//	void fly() {
//		flybehaviour.fly();
//	}

	void swim() {
		System.out.println("swimming");
	}

	abstract public void display();
}
