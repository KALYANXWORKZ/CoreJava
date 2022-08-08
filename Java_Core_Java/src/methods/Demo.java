package methods;

// Method without arguments and without returnType
public class Demo {
	void display() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Demo d = new Demo();

		d.display();
		System.out.println("End");

	}
}
