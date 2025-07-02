package lowLevelDesign.creational.abstractFactory.factory;

import lowLevelDesign.creational.abstractFactory.service.Button;
import lowLevelDesign.creational.abstractFactory.service.DropDown;
import lowLevelDesign.creational.abstractFactory.service.serviceImpl.IosButton;
import lowLevelDesign.creational.abstractFactory.service.serviceImpl.IosDropdown;
import lowLevelDesign.creational.abstractFactory.util.SupportedPlatform;

public class IosUiFactory implements UiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IosButton();
	}

	@Override
	public DropDown createDropDown() {
		// TODO Auto-generated method stub
		return new IosDropdown();
	}

	@Override
	public SupportedPlatform getPlatform() {
		// TODO Auto-generated method stub
		return SupportedPlatform.IOS;
	}

}
