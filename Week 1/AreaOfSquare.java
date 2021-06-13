import java.util.Scanner;

public class AreaOfSquare {
	public static void main (String[] args) {
		System.out.print("Enter side of Square: ");
		Scanner scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side;
		System.out.print("Area of Square is: "+area);
	}
}