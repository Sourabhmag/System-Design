package lowLevelDesign.structural.decorator.decorator;

import lowLevelDesign.structural.decorator.base.Coffee;

public class ChocoSyrup extends AbstractDecorator{

	public ChocoSyrup(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " ChocoSyrup";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 150;
	}

}
