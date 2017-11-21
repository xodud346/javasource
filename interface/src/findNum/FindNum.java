package findNum;

import java.util.Scanner;

public class FindNum {
	//필드(변수)
	int comNum;
	int UserNum;
	//생성자
	FindNum(){};
	//메서드(함수)
	void makeComNum() {
		comNum=(int)(Math.random()*9)+1;
		System.out.println(this.comNum);
	}
	
	void getUserNum() {
		Scanner sc=new Scanner(System.in);
		UserNum=sc.nextInt();
		
	}
	
	void compareNum() {
		makeComNum();
		getUserNum();
		while(true) {
			if(comNum==UserNum) {
			System.out.println("정답입니다");
			break;
			}else {
			System.out.println("정답이아닙니다.");
		    getUserNum();
		
		
	      	}
		}
		
	
	}
}
