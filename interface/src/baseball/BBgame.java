package baseball;

import java.util.Random;
import java.util.Scanner;

public class BBgame {
       int[] comNum = new int[3];
	   int[] usrNum = new int[3];
	   
	   //constructor
	   BBgame() {};
	      
	   //method
	   void makeComNum() {
	      while(true) {
	         if((comNum[0]!=comNum[1]) && 
	        		 (comNum[0]!=comNum[2]) && 
	        		 (comNum[1]!=comNum[2])) {
	            break;
	         }
	         for(int i=0; i<comNum.length; i++) {
	            comNum[i] = (int)(Math.random()*9)+1;
	            System.out.println(comNum[i]);
	         }
	      }   

	   }
	   
	   void getUsrNum() {
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("숫자를 입력하세요");
	      
	      for(int i=0; i<usrNum.length; i++) {
	         System.out.print((i+1) + "번째 수:");
	         usrNum[i] = scanner.nextInt();
//	         System.out.println(usrNum[i]);
	         
	         if(usrNum[i]>=10 || usrNum[i] < 1) {
	            System.out.println("1~9의 숫자만 입력하세요 ");
	            System.out.print((i+1) + "번째 수:");
	            usrNum[i] = scanner.nextInt();
	         } 
	      }
	      
	   }
	   
	   void compareNum() {
	      makeComNum();
	      
	      
	     
	      while(true) {
	      int strike=0;
	      int ball=0;
	      getUsrNum();
	      
	      for(int i=0; i<3; i++) {
	         for(int j=0; j<3; j++) {
	            if(comNum[i]==usrNum[j] && i==j) {

	               strike = strike + 1;
	            } else if(comNum[i]==usrNum[j] && i!=j) {

	               ball = ball + 1;
	            }
	         }
	      }
	      
	      if(strike==3) {
	         System.out.println("정답입니다.");
	         break;
	      } else {
	         System.out.println(strike+"strike, "+ball+"ball \n"  );
	      
	      }
	   }
	   }
	}
	
	//내꺼
/*	int[] numbers=new int[3];
	int[] inputNums=new int[3];
	
	void makeNum() {
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=(int)(Math.random()*9);
	 //   if((numbers[0]!=numbers[1])||(numbers[0]!=numbers[2])
	//  		 ||(numbers[1]!=numbers[2])) {
				System.out.println(numbers[i]);
			}
		}
	
	
	
	int inputNum() {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(i);
		return i;
	}
	void compareNum() {
		makeNum();
	    int strike=0;
	    int ball=0;
	    int i = inputNum();
	    
	     
	    if(numbers[0]==i/100) {
	    	strike++;
	    }else if(numbers[1]==(i/100)%10) {
	    	strike++;
	    }else if(numbers[2]==i%10) {
	    	strike++;
	    }
	   for(i=0;i<numbers.length;i++) {
		   for(int j=0;j<inputNums.length;j++) {
			   if(numbers[i]==i) {
				   strike++;
			   }else ball++;
		   }
	   }
	    System.out.println("strike:"+strike+"ball:"+ball);
	}
}*/
	
	
	
