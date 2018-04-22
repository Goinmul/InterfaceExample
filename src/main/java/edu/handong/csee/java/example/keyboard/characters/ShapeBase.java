package edu.handong.csee.java.example.keyboard.characters;

public abstract class ShapeBase implements ShapeInterface {

	private int offset;

	public ShapeBase() {
		offset = 0;
	}

	public ShapeBase(int theOffset) {
		offset = theOffset;
	}

	@Override
	public void setOffset(int newOffset) {
		offset = newOffset;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public void drawAt(int lineNumber) {
		for (int count = 0; count < lineNumber; count++)
			System.out.println();
		drawHere();
	}

	@Override
	public abstract void drawHere();

}
