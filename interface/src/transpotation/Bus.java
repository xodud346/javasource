package transpotation;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bus is Running");
	}
	public void checkFare() {
		System.out.println("Check fare");
	}

}
