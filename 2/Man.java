
public class Man {
	
	protected String name;
	protected int age;
	protected double weight;
	
	public Man(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString() {
		return "Man{name= " + name +
		", age= " + age + 
		", weight= " + weight +
		"}";
	}
}