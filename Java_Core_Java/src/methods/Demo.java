package methods;

public class Demo {

	/*
	 * Method is a set of instruction it perform specific task and it may or may not
	 * return the value
	 * 
	 * Syntax= Access Specifier return type methodName() { Block of code }
	 */

	// Method without arguments And without return type

	void disply() {
		System.out.println("Welcome to Java ");
	}

	// Method with arguments And without return type

	void number(int a) {

		System.out.println(a);
	}

	// Method without arguments And with return type

	int test() {

		return 50;
	}

	// Method with arguments And with return type

	int runner(int b, int c) {
		return b + c;
	}

	public static void main(String[] args) {

		System.out.println("Start");
		Demo d = new Demo();
		d.disply();
		System.out.println("End");

		d.number(10);
		int result = d.test();
		System.out.println(result);
		int add = d.runner(10, 20);
		System.out.println(add);

	}

}
