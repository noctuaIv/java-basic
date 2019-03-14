package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {
		Start start = new Start();

		Car car1 = new Car("BMW");
		start.test1(car1);

		int i = 2;
		start.test2(i);
		System.out.println("car.getName() = " + car1.getName());
		System.out.println("i = " + i);

		start.test3(car1);

		System.out.println("car = " + car1);

		Car car2 = new Car();
		start.test4(car1, car2);

	}

	public void test1(Car car) {
		car.setName("Toyota");
	}

	public void test2(int i) {
		i = 6;
		System.out.println("i = " + i);
	}

	public void test3(Car car) {
		car = new Car("Citroen");
		test5(car);
	}

	public void test4(Car... cars) {
		System.out.println("cars.length = " + cars.length);
	}

	public void test5(Car car) {
		car = new Car("KIA");
	}

}
