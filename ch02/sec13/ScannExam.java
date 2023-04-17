package ch02.sec13;

import java.util.Scanner;

public class ScannExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x 값 입력:");		
		String strX = scan.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력:");		
		String stry = scan.nextLine();
		int y = Integer.parseInt(stry);

		int result = x + y;
		System.out.println("x + y = " + result); // x 와 y를 입력받아 계산진행
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scan.nextLine();
			if(data.equals("q"))					// 문자여를 입력받고 입력받은 문자여을 그대로 출력하며 q 가 입력 될시 종료
				break;
			

			System.out.println("출력 문자열 :" + data);
			System.out.println();
		}
		
		System.out.println("종료");
	}
}
