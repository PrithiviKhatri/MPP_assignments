package lesson7_lab5;


public interface QuackBehaviour {
	default void quack(){
		System.out.println("quacking");
	}
	
}
