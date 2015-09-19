package lesson7_lab5;

public class MainClass {

public static void main(String[] args) {
	Duck[] ducks={new MallardDuck(),new DecoyDuck(),new RedheadDuck(),new RubberDuck()};
		for (Duck d : ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
}

}
