package transpotation;

public class Vehicle_example {

	public static void main(String[] args) {
	//	Vehicle vehicle2=new Vehicle(); �������̽��� ��üȭ ����Ŵ
		Vehicle vehicle=new Bus();//�ڵ�����ȯ
		
		vehicle.run();//Vehicle ���� -> Bus ����
//		vehicle.checkFare();
		
		if(vehicle instanceof Bus){
			System.out.println("���� �����մϴ�.");
        Bus bus=(Bus)vehicle;
        bus.run();
        bus.checkFare();}

	}

}
