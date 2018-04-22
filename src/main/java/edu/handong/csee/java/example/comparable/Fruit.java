package edu.handong.csee.java.example.comparable;

public class Fruit implements Comparable<Fruit> {
	private String fruitName;

	public Fruit() {
		fruitName = "";
	}

	public Fruit(String name) {
		fruitName = name;
	}

	public void setName(String name) {
		fruitName = name;
	}

	public String getName() {
		return fruitName;
	}

	@Override
	public int compareTo(Fruit o) {
		if ((o != null) && (o instanceof Fruit)) {
			Fruit otherFruit = (Fruit) o;
			return (fruitName.compareTo(otherFruit.fruitName));
		}
		return -1; // Default if other object is not a Fruit
	}
}
