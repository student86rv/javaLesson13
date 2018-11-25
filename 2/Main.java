import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Man man1 = new Man("Victor", 25, 68.5);
		System.out.println(""+man1);
		
		Student student1 = new Student("Oleg", 31, 81.0, 2018);
		System.out.println(""+student1);
		System.out.println();
		
		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(student1);
		studentsList.add(new Student("Igor", 29, 76.0, 2017));
		studentsList.add(new Student("Dmitrii", 30, 86.0, 2017));
		
		for(int i= 0;i < studentsList.size(); i++) {
			System.out.println(studentsList.get(i));
		}

		FileOperator record1 = new FileOperator(studentsList, "java02oct.txt");
		record1.writeFile();
		System.out.println("From File:");
		record1.readFile();
	}
}