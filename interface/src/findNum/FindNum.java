package findNum;

import java.util.Scanner;

public class FindNum {
	//�ʵ�(����)
	int comNum;
	int UserNum;
	//������
	FindNum(){};
	//�޼���(�Լ�)
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
			System.out.println("�����Դϴ�");
			break;
			}else {
			System.out.println("�����̾ƴմϴ�.");
		    getUserNum();
		
		
	      	}
		}
		
	
	}
}
