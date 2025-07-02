package lowLevelDesign.creational.prototype;

public class IntellijentStudent extends Student {
	private int iq;

	public IntellijentStudent() {
	}

	public IntellijentStudent(IntellijentStudent is) {
		super(is);
		this.iq = is.iq;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public IntellijentStudent clone() {
		return new IntellijentStudent(this);
	}

	@Override
	public String toString() {
		return "IntellijentStudent [iq=" + iq + "name=" + super.getName() + ", id=" + super.getId() + ", school=" + super.getSchool() + "]";
	}
}
