package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setName("BMW");

		Car c2 = new Car();
		c2.setName("BMW");

		System.out.println("c1 = " + c1);

		System.out.println(c1.equals(c2));

		System.out.println("c1 = " + c1.hashCode());
		System.out.println("c2 = " + c2.hashCode());

	}

}
