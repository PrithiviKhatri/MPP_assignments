package lesson7_lab3;

public interface Cache {
	//shouldn't be static
	default public  long timeout() {
		//seconds
		return 1;
	}


}
