package lesson7_lab5;

public interface FlyBehaviour {
	default void fly() {
		System.out.println("fly with wings");
	}
}
