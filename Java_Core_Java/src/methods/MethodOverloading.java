package methods;

public class MethodOverloading {

	/*
	 * In a class having multiple method with same name but difference in arguments
	 * is called as method overloading
	 * 
	 * In order to achieve method overloading we have to satisfy either one of the
	 * following rules
	 * 
	 * 1. There should be change in datatype
	 * 2. there should be change in arguments
	 * 3. There should be change in sequence of datatype
	 */

	void display(int a) {
		System.out.println(a);
	}

	void display() {
		System.out.println("Welcome to Java");
	}

	int display(int b, int c) {
		return b * c;
	}

	void display(int d, String e) {

		System.out.println(d + " " + e);
	}

	void display(double f) {
		System.out.println(f);
	}

	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.display();
		mol.display(20.5);
		mol.display(25);
		int result = mol.display(20, 30);
		System.out.println(result);
		mol.display(101, "Kalyan");

	}
}
