package lesson7_lab1_partE;

public interface B extends A {
	@Override
	default public void method(){
		System.out.println("inside interface B");
	}

}
