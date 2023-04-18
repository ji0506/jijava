package ch04.sec02;

import java.util.Scanner;

public class Ifswich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		String str = "";
		int num;
		int nGrade;
		char grade;
		
		while(true)
		{		
			
			System.out.print("점수를 입력(종료:Q) : ");
			
			str = scan.nextLine();

			if("Q".equals(str))
				break;
			
			num = Integer.parseInt(str);
	
			nGrade = num/10;
			grade = 0;
	
			switch(nGrade)
			{
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				
			}
		
			System.out.println("당신의 점수는 "+ num + "이고 학점은 " + grade + "입니다.87");
		}
		System.out.println("종료");
		
	}

}
