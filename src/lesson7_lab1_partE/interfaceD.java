package lesson7_lab1_partE;

public interface interfaceD extends B, C {

//	// @Override
// void method();

//@Override
default void method(){
	System.out.println("inside interface D");
}
}
