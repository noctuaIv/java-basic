package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = c1;// two variables point to one object

		c1.setName("BMW");
		System.out.println("c2.getName() = " + c2.getName());

		c2.setName("Toyota");
		System.out.println("c1.getName() = " + c1.getName());
		
//		System.out.println("c1.getName() = " + c1.getName());
//		System.out.println("c1.getName() = " + c1.getName().length());// java.lang.NullPointerException if "name = null"
//		
//		c1 = null;
//
//		System.out.println("c1 = " + c1.getName());// java.lang.NullPointerException if "name = null"
		
		c1 = null;
		c2 = null;
	}

}