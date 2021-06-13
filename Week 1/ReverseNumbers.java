import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String args[]) {
		int num=0;
		int reversenum =0;
		System.out.print("Enter random number and press enter key: "); 
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		while( num != 0 ) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		System.out.print("Reverse of input number is: "+reversenum);
	}
}