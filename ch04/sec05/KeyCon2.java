package ch04.sec05;

import java.util.Scanner;

public class KeyCon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력화세요");
		
		String str;
		
		do {
			System.out.print(">");
			str = scan.nextLine();
			System.out.println(str);
		}while(!str.equals("q"));
		
		System.out.println();
		System.out.println("프로그램을 종료");

	}

}
