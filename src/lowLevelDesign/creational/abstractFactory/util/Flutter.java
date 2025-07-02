package lowLevelDesign.creational.abstractFactory.util;

import java.util.List;

import lowLevelDesign.creational.abstractFactory.factory.AndroidUiFactory;
import lowLevelDesign.creational.abstractFactory.factory.IosUiFactory;
import lowLevelDesign.creational.abstractFactory.factory.UIPlatformFactory;
import lowLevelDesign.creational.abstractFactory.factory.UiFactory;

public class Flutter {
	private SupportedPlatform platform;
	
	public Flutter(SupportedPlatform platform) {
		this.platform = platform;
	}
	
	public UiFactory createUiFactory() {
		UIPlatformFactory uiPlatformFactory = new UIPlatformFactory(List.of(
                new AndroidUiFactory(), new IosUiFactory()
        ));
        return uiPlatformFactory.getUiFactory(this.platform);
	}
}
