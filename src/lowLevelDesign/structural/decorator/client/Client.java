package lowLevelDesign.structural.decorator.client;

import lowLevelDesign.structural.decorator.base.Cappuccino;
import lowLevelDesign.structural.decorator.base.Coffee;
import lowLevelDesign.structural.decorator.decorator.ChocoSyrup;
import lowLevelDesign.structural.decorator.decorator.VanillaDecorator;

public class Client {
	public static void main(String[] args) {
		Coffee capuccino = new Cappuccino();
		capuccino = new VanillaDecorator(capuccino);
		capuccino = new ChocoSyrup(capuccino);
		
		System.out.println(capuccino.getDescription() + " - "+ capuccino.getCost());
	}
}
