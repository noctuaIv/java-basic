package ua.voytovych.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Start {

	public static void main(String[] args) {

		// arrayListExample();
		linkedListExample();

	}

	public static void arrayListExample() {

		ArrayList<Car> cars = new ArrayList();

		Car car1 = new Car("BMW");
		Car car2 = new Car("Opel");
		Car car3 = new Car("Nissan");
		Car car4 = new Car("Nissan");

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		cars.add(new Car("Toyota"));

		System.out.println("cars.size() = " + cars.size());

		System.out.println("cars.contains(car2) = " + cars.contains(car2));

		int index = cars.indexOf(car3);
		System.out.println("index = " + index);

		Car selectedCar = cars.get(3);
		System.out.println("selectedCar = " + selectedCar.getName());

		Iterator<Car> iterator = cars.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());

		}

		cars.clear();
		System.out.println("cars.isEmpty() = " + cars.isEmpty());

		// selectedCar = cars.get(2);// IndexOutOfBoundsException
	}

	public static void linkedListExample() {

		LinkedList<Car> cars = new LinkedList();

		Car car1 = new Car("BMW");
		Car car2 = new Car("Opel");
		Car car3 = new Car("Nissan");
		Car car4 = new Car("Nissan");

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		cars.addLast(car1);

		Iterator<Car> iterator = cars.descendingIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());

		}
	}

}
