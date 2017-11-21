package transpotation;

public interface Vehicle {
    //필드상수[public static final]생략가능
	
	
	//추상 메서드[abstract]생략가능
	public void run();
	//Update
	default void electCharge() {
		System.out.println("충전중입니다.");
	}
	
	
}
