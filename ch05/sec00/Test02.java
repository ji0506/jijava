package ch05.sec00;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하세요. : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("최대 공약수 : " + fun(a,b,c));
	}

	static int fun(int a, int b, int c)
	{
		int min = 0;
		if(a > b){
			if(b > c) {
				min = c;
			}
			else {
				min = b;
			}
		}else {
			if(a > c)
				min = c;
			else 
				min = a;
		}
	
		for(int i = min; i > 0; i--) {
			if(a % i == 0 && b % i == 0 && c % i == 0)
				return i;
		}
		
		return -1;
	}
	
}
