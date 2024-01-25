package util;

public class Calculator {
	public static final double PI = 3.14159; // static porque ele tem um valor independente do objeto.

	public static double circumference(double radius) { // static porque pode ser calculada independente do objeto.
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
