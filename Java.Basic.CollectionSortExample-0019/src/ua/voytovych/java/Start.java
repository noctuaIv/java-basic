package ua.voytovych.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Start {

	private static ArrayList<Car> cars = new ArrayList();

	public static void main(String[] args) {

		Car car1 = new Car("BMW", 1999);
		Car car2 = new Car("Opel", 1901);
		Car car3 = new Car("Nissan", 1854);
		Car car4 = new Car("Mazda", 1798);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		Collections.sort(cars);

		print(cars);

		System.out.println("cars.get(0).getName() = " + cars.get(0).getName());

		Collections.sort(cars, new CarYearComparator());

		print(cars);

		CarNameComparator carNameComparator = new CarNameComparator();
		CarYearComparator carYearComparator = new CarYearComparator();

		Collections.sort(cars, carNameComparator);

		TreeSet<Car> carsSet = new TreeSet<Car>(carNameComparator);
		carsSet.add(car1);
		carsSet.add(car2);
		carsSet.add(car3);
		carsSet.add(car4);

		print(carsSet);

	}

	public static void print(Collection collection) {
		System.out.println();
		Iterator<Car> iterator = collection.iterator();

		while (iterator.hasNext()) {
			Car car = iterator.next();
			System.out.println(car.getName() + ", " + car.getYear());

		}
	}

}
