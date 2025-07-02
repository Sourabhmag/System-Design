package lowLevelDesign.structural.decorator.decorator;

import lowLevelDesign.structural.decorator.base.Coffee;

public abstract class AbstractDecorator implements Coffee {
	protected Coffee coffeeDecorator;

	public AbstractDecorator(Coffee coffee) {
		this.coffeeDecorator = coffee;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffeeDecorator.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.coffeeDecorator.getCost();
	}
}
