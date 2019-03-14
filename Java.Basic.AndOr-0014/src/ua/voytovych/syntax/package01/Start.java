package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {

		if (condition1() & condition2()) {
			System.out.println("ok");
		}
		
//		if (condition1() && condition2()) {
//			System.out.println("ok");
//		}
		
//		if (condition1() || condition2()) {
//			System.out.println("ok");
//		}
	}

	public static boolean condition1() {
		System.out.println("condition1");
		return false;
	}

	public static boolean condition2() {
		System.out.println("condition2");
		return true;
	}

}
