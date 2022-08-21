package methods;

public class WhatsApp2 extends WhatsApp1{
	@Override
	void display() {
        super.display();
		System.out.println("Double tick supported");
	}
	void call() {
		System.out.println("voice call supported");
	}

}
