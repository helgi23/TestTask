package Classes;

import java.util.Random;

public class Triangle implements IFigure {
	private int sideA;
	private int sideB;
	private int sideC;

	public Triangle() {
		//setting random values within [0,30] to each variable
		this.sideA = new Random().nextInt(30) + 1;
		this.sideB = new Random().nextInt(30) + 1;
		this.sideC = new Random().nextInt(30) + 1;
	}

	@Override
	public void draw() {
		System.out.println("Here we draw Triangle");
	}

	@Override
	public int getArea() {
		return sideA * sideB * 1 / 2;
	}

	public int getSideLength() {
		return sideC;
	}

	@Override
	public int getPerimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	public String toString() {
		return "Figure: " + this.getClass().getSimpleName() + ", area: " + this.getArea() + " square units., perimeter: "
				+ this.getPerimeter() + " units., color: " + Color.getRandomColor();
	}
}
