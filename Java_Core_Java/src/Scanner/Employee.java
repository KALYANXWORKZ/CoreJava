package Scanner;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id =scan.nextInt();
		System.out.println("Enter Emplyee name");
		String name=scan.next();
		System.out.println("Enter emplyee salary");
		double salary = scan.nextDouble();
		
		System.out.println("-----------------------");
		
		System.out.println("Employee id is : "+id);
		System.out.println("Name of the Employee is : "+name);
		System.out.println("Employee salary is : ");


	}

}
