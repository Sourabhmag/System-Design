package lowLevelDesign.structural.decorator.decorator;

import lowLevelDesign.structural.decorator.base.Coffee;

public class VanillaDecorator extends AbstractDecorator{

	public VanillaDecorator(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " Vanilla";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 100;
	}

}
