package lowLevelDesign.creational.abstractFactory.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lowLevelDesign.creational.abstractFactory.util.SupportedPlatform;

public class UIPlatformFactory {
	private Map<SupportedPlatform, UiFactory> map = new HashMap<SupportedPlatform, UiFactory>();
	
	public UIPlatformFactory(List<UiFactory> list) {
		for(UiFactory uiFactory : list) {
			map.put(uiFactory.getPlatform(), uiFactory);
		}
	}

	public UiFactory getUiFactory(SupportedPlatform platform) {
		// TODO Auto-generated method stub
		return map.get(platform);
	}
}
