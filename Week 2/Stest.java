class Student {
	String name, city;
	int age;
	static int m;
	void printData() {
		System.out.println("Student name = "+ name);
		System.out.println("Student city = "+ city);
		System.out.println("Student age = "+ age);
	}
}
public class Stest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Nikith";
		s1.city = "Rajahmundry";
		s1.age = 22;
		
		s2.name = "Musharaf";
		s2.city = "Chennai";
		s2.age = 21;
		
		s2.printData();
		System.out.println();
		s1.printData();
		
		s1.m = 20;
		s2.m = 22;
	}
}