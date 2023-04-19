package ch05.sec00;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("약수를 구할 대상의 정수를 입력하세요 : ");
		int x = scan.nextInt();
		System.out.print("몇번째 약수를 구할 것인지 입력하세요 : ");
		int y = scan.nextInt();

		int result = fun(x,y);
		if(result == -1)
			System.out.println("해당 정수의 10번쨰 약수는 없습니다");
		System.out.println(result);

		
	}

	static int fun(int number, int k)
	{
		for(int i = 1; i<= number; i++)
		{
			if(number % i == 0)
			{
				k--;
				if(k == 0)
					return i;
			}
		}		
			
		return -1;
	}
	
}
