package transpotation;

public interface Vehicle {
    //�ʵ���[public static final]��������
	
	
	//�߻� �޼���[abstract]��������
	public void run();
	//Update
	default void electCharge() {
		System.out.println("�������Դϴ�.");
	}
	
	
}
