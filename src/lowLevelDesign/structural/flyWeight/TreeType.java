package lowLevelDesign.structural.flyWeight;

public class TreeType {
	private String name;
	private String color;
	private String texture;

	public TreeType(String name, String color, String texture) {
		super();
		this.name = name;
		this.color = color;
		this.texture = texture;
	}

	public void plant(int x, int y) {
		System.out.println(x + " "+ y+" "+name+" "+color+" "+texture);
	}
}
