package lowLevelDesign.structural.flyWeight;

public class Client {
	public static void main(String[] args) {
		Forest thar = new Forest();
		thar.plantTree(10,20, "Pine", "Green", "Amazon");
		thar.plantTree(1,45, "Banana", "Green", "Maharashtra");
		thar.plantTree(10,45, "Banana", "Green", "Maharashtra");
		thar.plantTree(15,75, "Banana", "Green", "Maharashtra");
		thar.plantTree(48,25, "Banana", "Green", "Maharashtra");
		thar.plantTree(34,78, "Apple", "Green", "Shimla");
		
		thar.plant();
	}
}
