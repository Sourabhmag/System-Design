package lowLevelDesign.creational.builder;

public class Student {
	private String name;
	private int age;
	private String school;
	private String university;
	private int std;
	private char division;
	
	private Student(StudentBuilder studentBuilder) {
		this.name = studentBuilder.name;
		this.age = studentBuilder.age;
		this.school = studentBuilder.school;
		this.university = studentBuilder.university;
		this.std = studentBuilder.std;
		this.division = studentBuilder.division;
	}
	
	public static StudentBuilder builder() {
	    return new StudentBuilder();
	}
	
	public static class StudentBuilder{
		private String name;
		private int age;
		private String school;
		private String university;
		private int std;
		private char division;
		
		
		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public StudentBuilder school(String school) {
			this.school = school;
			return this;
		}
		
		public StudentBuilder university(String university) {
			this.university = university;
			return this;
		}
		
		public StudentBuilder std(int std) {
			this.std = std;
			return this;
		}
		
		public StudentBuilder division(char division) {
			this.division = division;
			return this;
		}
		
		public Student build() {
			if(!validate()) {
				throw new RuntimeException("Name is not valid");
			}
			return new Student(this);
		}
		
		private boolean validate() {
			return this.name != null;
		}
	}
}
