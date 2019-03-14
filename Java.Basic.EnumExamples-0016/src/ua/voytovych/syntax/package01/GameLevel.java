package ua.voytovych.syntax.package01;

public enum GameLevel {

	BEGINNER(0, "Beginner"), PROFESSIONAL(1, "Profession"), HARD(2, "Hard");

	private int index;
	private String name;

	private GameLevel(int index, String name) {
		this.index = index;
		this.name = name;
	}

}
