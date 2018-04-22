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
	public int compareTo(Fruit otherFruit) {
		return (fruitName.compareTo(otherFruit.fruitName));
	}

	/*
	@Override
	public int compareTo(Fruit otherFruit) {

		if(fruitName.length() > otherFruit.fruitName.length())
			return 1;
		else if (fruitName.length() < otherFruit.fruitName.length())
			return -1;
		else
			return 0;
	}
	 */
}
