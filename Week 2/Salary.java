import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
	public static void main (String[] args) {
		double currentSalary;
		double raise;
		double newSalary;
		String rating;
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating(Excellent, Good, or Poor): ");
		rating = scan.next();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		if(rating != "Excellent") {
			raise = currentSalary * (6 / 100);
			newSalary = currentSalary + raise;
			System.out.println(); 
			System.out.println("Current Salary: " + money.format(currentSalary)); 
			System.out.println("Amount of your raise: " + money.format(raise)); 
			System.out.println("Your new salary: " + money.format(newSalary)); 
		}
	}
}