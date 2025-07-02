package lowLevelDesign.structural.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	private static Map<String, TreeType> treeFactory = new HashMap<String, TreeType>();

	public static TreeType plant(String name, String color, String texture) {
		String key = name + "_" + color + "_" + texture;
		TreeType tree = new TreeType(name, color, texture);
		treeFactory.put(key, tree);
		return tree;
	}
	
	public static TreeType getTree(String name, String color, String texture) {
		String key = name + "_" + color + "_" + texture;
		if(treeFactory.containsKey(key)) {
			return treeFactory.get(key);
		}else {
			return plant(name, color, texture);
		}
	}
}
