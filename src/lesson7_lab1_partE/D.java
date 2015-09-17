package lesson7_lab1_partE;

public class D implements B,C {

	@Override
	public void method(){
		System.out.println("inside D");
	}
	
	public static void main(String[] args) {
		A a = new D();
		a.method();


	}


}
