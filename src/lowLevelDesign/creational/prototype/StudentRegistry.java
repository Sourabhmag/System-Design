package lowLevelDesign.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	Map<String, Student> registery = new HashMap<String, Student>();
	
	public void register(String name, Student student) {
		registery.put(name, student);
	}
	
	public Student getStudent(String name) {
		return registery.get(name);
	}
}
