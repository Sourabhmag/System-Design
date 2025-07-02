package lowLevelDesign.creational.abstractFactory.client;

import lowLevelDesign.creational.abstractFactory.factory.UiFactory;
import lowLevelDesign.creational.abstractFactory.service.Button;
import lowLevelDesign.creational.abstractFactory.service.DropDown;
import lowLevelDesign.creational.abstractFactory.util.Flutter;
import lowLevelDesign.creational.abstractFactory.util.SupportedPlatform;

public class Client {

	public static void main(String[] args) {
		UiFactory uiFactory = new Flutter(SupportedPlatform.ANDROID).createUiFactory();
		Button button = uiFactory.createButton();
		DropDown dropDown = uiFactory.createDropDown();
		
		button.paint();
		dropDown.paint();
	}

}
