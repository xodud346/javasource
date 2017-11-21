package transpotation;

public class Vehicle_example {

	public static void main(String[] args) {
	//	Vehicle vehicle2=new Vehicle(); 인터페이스는 객체화 못시킴
		Vehicle vehicle=new Bus();//자동형변환
		
		vehicle.run();//Vehicle 선언 -> Bus 구현
//		vehicle.checkFare();
		
		if(vehicle instanceof Bus){
			System.out.println("변경 가능합니다.");
        Bus bus=(Bus)vehicle;
        bus.run();
        bus.checkFare();}

	}

}
