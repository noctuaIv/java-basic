package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {
		Car car = new Car();
		car.setName("Toyota");
		System.out.println("");
		

		car.setName("BMW");
		car = null;
	}

}