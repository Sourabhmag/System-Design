package lowLevelDesign.creational.abstractFactory.factory;

import lowLevelDesign.creational.abstractFactory.service.Button;
import lowLevelDesign.creational.abstractFactory.service.DropDown;
import lowLevelDesign.creational.abstractFactory.service.serviceImpl.AndroidButton;
import lowLevelDesign.creational.abstractFactory.service.serviceImpl.AndroidDropdown;
import lowLevelDesign.creational.abstractFactory.util.SupportedPlatform;

public class AndroidUiFactory implements UiFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	@Override
	public DropDown createDropDown() {
		// TODO Auto-generated method stub
		return new AndroidDropdown();
	}

	@Override
	public SupportedPlatform getPlatform() {
		// TODO Auto-generated method stub
		return SupportedPlatform.ANDROID;
	}

}
