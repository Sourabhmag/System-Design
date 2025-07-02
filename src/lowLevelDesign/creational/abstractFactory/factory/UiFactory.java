package lowLevelDesign.creational.abstractFactory.factory;

import lowLevelDesign.creational.abstractFactory.service.Button;
import lowLevelDesign.creational.abstractFactory.service.DropDown;
import lowLevelDesign.creational.abstractFactory.util.SupportedPlatform;

public interface UiFactory {
	Button createButton();
	DropDown createDropDown();
	SupportedPlatform getPlatform();
}
