package ch04.sec02;

public class IfDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6)+1;
	
		if(num == 1)
			System.out.println("1번이 나왔습니다.");
		
		System.out.println(num);

	}

}
