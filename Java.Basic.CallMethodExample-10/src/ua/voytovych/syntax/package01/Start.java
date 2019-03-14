package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {

		Start start = new Start();

		start.printString(start.getNewValue(start.getString()));

		start.printString(start.returnMethod());

		start.recursive(0);

	}

	private String getNewValue(String string) {
		return string += "and new value!";
	}

	public String getString() {
		return "new string";
	}

	public void printString(String value) {
		System.out.println("value = " + value);
	}

	public String returnMethod() {
		return getNewValue("new value");
	}

	public int recursive(int value) {
		value += 1;
		if (value == 10) {
			return value;
		}
		System.out.println(value);

		return recursive(value);// recursion
	}

	public String returnExample(int count) {

		if (count == 0) {
			return "error";
		}
		// body method
		if (count < 0) {
			return "negative";
		} else {
			return "unknown";
		}
	}

	public void returnExampleVoid(int count) {

		if (count == 0) {
			return;
		}
		// body method

	}

}
