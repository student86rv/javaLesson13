
public class Triangle {
	
	public static class Point {
		private int x;
		private int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int x) {
			this.y = y;
		}
		public String toString() {
			return "Point{" + "x= " + x + ", y= " + y + "}";
		}
	}
		
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	private double lineCalc(Point point1, Point point2) {
		int x = point2.getX() - point1.getX();
		int y = point2.getY() - point1.getY();
		return Math.sqrt(x*x + y*y);
	}
	
	public double getSquare() {
		double lineAB = lineCalc(pointA, pointB);
		double lineBC = lineCalc(pointB, pointC);
		double lineAC = lineCalc(pointA, pointC);
		double p = 0.5 * (lineAB + lineBC + lineAC);
		return Math.sqrt(p * (p - lineAB) * (p - lineBC) * (p - lineAC));
	}
				
	public String toString() {
		return "Triangle{" + pointA + ", " + pointB + ", " + pointC + "}";
	}
}