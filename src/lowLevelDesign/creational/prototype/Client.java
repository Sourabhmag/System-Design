package lowLevelDesign.creational.prototype;

public class Client {

	public static void fillRegistry(StudentRegistry studentRegistry) {
		Student st1 = new Student();
		st1.setId(1);
		st1.setName("Sourabh");
		st1.setSchool("DKTE");
		studentRegistry.register(st1.getName(), st1);
		
		IntellijentStudent is1 = new IntellijentStudent();
		is1.setIq(12);
		is1.setName("Rahul");
		
		studentRegistry.register(is1.getName(), is1);
	}

	public static void main(String[] args) {
		StudentRegistry studentRegistry = new StudentRegistry();
		fillRegistry(studentRegistry);
		Student st = studentRegistry.getStudent("Sourabh");
		Student st1 = st.clone();
		st1.setId(12);
		st1.setName("Sourabh");
		System.out.println(st1.toString());
	}
}
