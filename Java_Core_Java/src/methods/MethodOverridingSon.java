package methods;

public class MethodOverridingSon extends MethodOverridingFather {

	@Override

	void home() {

		System.out.println("New modified Son's home");
	}

	public static void main(String[] args) {

		MethodOverridingSon ms = new MethodOverridingSon();
		ms.home();
	}
}