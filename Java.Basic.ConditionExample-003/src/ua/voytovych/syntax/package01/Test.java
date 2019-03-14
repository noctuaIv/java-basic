package ua.voytovych.syntax.package01;

public class Test {
	public void testMethod(int count) {
		if (count > 5) {
			count += 1;
			// test2
		} else if (count < 0) {
			count = -10;
		} else {
			count += 5;
			// test3
		}

		switch (count) {
		case 5:
			test2();
			break;
		case 10:
			test3();
			break;
		default:
		}

		// ternary conditional operator
		// count = count>0?count+1:count+5;

		System.out.println(count);
	}

	private void test2() {
		System.out.println("test2");
	}

	private void test3() {
		System.out.println("test3");
	}
}
