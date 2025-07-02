package lowLevelDesign.structural.flyWeight;

public class Tree {
	private int x;
	private int y;
	private TreeType treeType;

	public Tree(int x, int y, TreeType treeType) {
		super();
		this.x = x;
		this.y = y;
		this.treeType = treeType;
	}

	public void plant() {
		treeType.plant(x,y);
	}

}
