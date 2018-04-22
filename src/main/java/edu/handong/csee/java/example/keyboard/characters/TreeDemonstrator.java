package edu.handong.csee.java.example.keyboard.characters;

public class TreeDemonstrator {

	public final int INDENT = 5;
	public static final int TREE_TOP_WIDTH = 21;// must be odd
	public static final int TREE_BOTTOM_WIDTH = 4;
	public static final int TREE_BOTTOM_HEIGHT = 4;

	public static void main(String[] args) {
		
		TreeDemonstrator demonstrator = new TreeDemonstrator();
		demonstrator.drawTree(TREE_TOP_WIDTH, TREE_BOTTOM_WIDTH,
				TREE_BOTTOM_HEIGHT);
	}

	public void drawTree(int topWidth, int bottomWidth, int bottomHeight)
	{
		System.out.println(" Save the Redwoods!");
		TriangleInterface treeTop = new Triangle(INDENT, topWidth);
		drawTop(treeTop);
		RectangleInterface treeTrunk = new Rectangle(INDENT +
				(topWidth / 2) - (bottomWidth / 2),
				bottomHeight, bottomWidth);
		drawTrunk(treeTrunk);
	}

	private void drawTop(TriangleInterface treeTop) {
		treeTop.drawAt(1);
	}

	private void drawTrunk(RectangleInterface treeTrunk) {
		treeTrunk.drawHere(); // or treeTrunk.drawAt(0); }

	}
}