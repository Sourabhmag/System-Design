package lowLevelDesign.creational.builder;

public class Driver {

	public static void main(String[] args) {
		Student sourabh = Student.builder()
				.name("Sourabh")
				.age(23)
				.school("TSSM")
				.university("SPPU")
				.division('A')
				.build();
	}

}
