package methods;

public class WhatsApp3 extends WhatsApp2 {
	@Override
	void display() {
		super.display();
		System.out.println("Blue tick Suppoterd");
	}
	@Override
	void call() {
		super.call();
		System.out.println("video call supported");
	}
	void story() {
		System.out.println("Can Upload images and Story");
	}
}
