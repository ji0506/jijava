package ch02.sec08;



//프린트 할때 소수점 제한하여 출력

public class Test01 {
	public static void main(String[] args) {
		int a= 10;
		int b = 3;
		double c =0;
		c= (double)a/b;
	
		System.out.printf("%1.2f",c);
		
		
	}
}
