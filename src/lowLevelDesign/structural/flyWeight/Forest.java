package lowLevelDesign.structural.flyWeight;

import java.util.ArrayList;

public class Forest {
	private ArrayList<Tree> list = new ArrayList<Tree>();
	
	public void plantTree(int x, int y, String name, String color, String texture) {
		TreeType treeType = TreeFactory.getTree(name, color, texture);
		list.add(new Tree(x, y, treeType));
	}
	
	public void plant() {
		for(Tree tree : list) {
			tree.plant();
		}
	}
}
