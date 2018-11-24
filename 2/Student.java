
public class Student extends Man {
	
	private int year;
	
	public Student(String name, int age, double weight, int year) {
		super(name, age, weight);
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return "Student{name= " + name + 
				", age= " + age + 
				", weight= " + weight +
				", year= " + year + 
				"}";
	}
}