
public class Main {
	
	public static void main(String[] args) {
		
		Triangle.Point pointA = new Triangle.Point(0, -10);
		Triangle.Point pointB = new Triangle.Point(12, 21);
		Triangle.Point pointC = new Triangle.Point(30, 18);
		
		Triangle triangle1 = new Triangle(pointA, pointB, pointC);
		
		System.out.println("triangle1 = "+triangle1);
		System.out.println();
		System.out.println("S="+triangle1.getSquare());
	}
}