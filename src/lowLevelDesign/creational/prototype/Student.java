package lowLevelDesign.creational.prototype;

public class Student implements Prototype<Student> {
	private String name;
	private int id;
	private String school;

	public Student(Student s) {
		super();
		this.name = s.name;
		this.id = s.id;
		this.school = s.school;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Student clone() {
		return new Student(this);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", school=" + school + "]";
	}
}
