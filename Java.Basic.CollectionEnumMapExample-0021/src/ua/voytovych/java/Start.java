package ua.voytovych.java;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Start {

	public static void main(String[] args) {

		EnumSet<WeekDay> holiday = EnumSet.of(WeekDay.SATURDAY, WeekDay.SUNDAY);

		List<Car> minivanCars = new ArrayList<Car>();
		minivanCars.add(new Car("Toyoto"));
		minivanCars.add(new Car("BMW"));

		List<Car> sportCars = new ArrayList<Car>();
		sportCars.add(new Car("Lexus"));
		sportCars.add(new Car("Audi"));

		EnumMap<CarType, List<Car>> enumMap = new EnumMap<CarType, List<Car>>(CarType.class);

		enumMap.put(CarType.MINIVAN, minivanCars);
		enumMap.put(CarType.SPORT, sportCars);

		enumMap.get(CarType.SPORT);

		iterateMap(enumMap);

	}

	private static void iterateMap(EnumMap<CarType, List<Car>> map) {
		System.out.println();
		Iterator<Map.Entry<CarType, List<Car>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<CarType, List<Car>> carEntry = iterator.next();
			System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
		}
	}

}
