package ua.voytovych.syntax.package01;

public class Car {
	private String name;
	private int i = 5, x = 6;
	private int y = 5;

	public Car(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}

	private void test() {
		int i = 4;
		// go(i);
	}

	public void go() {
		int count = 0;
		count++;
		System.out.println(i);
	}

	public int getI() {
		return i;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

	}

}