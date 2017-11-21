package goliath;

public class GAll {

	public static void main(String[] args) {
	   GtoA ga=new GtoA() {
		   public void attackAir() {
			   System.out.println("익명 구현 객체");
		   }
	   };
	   
	  ga.attackAir(); 
	  

	}

}
