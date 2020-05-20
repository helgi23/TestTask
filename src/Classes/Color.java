package Classes;

import java.util.Random;

public enum Color {
	Black, White, Orange, Purple, Green;

	public static Color getRandomColor() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
}
