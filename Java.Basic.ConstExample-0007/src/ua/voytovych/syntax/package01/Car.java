package ua.voytovych.syntax.package01;

public class Car {

	private static final int DEFAULT_VALUE = 5;

	public static final String TEST_ID = "123";

	private final String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	// private void test(){
	// name = "new name";//compilation error
	// }

	// int i = 2;
	// private void test(){
	// int height = DEFAULT_VALUE/i; //magic number
	// }
}
