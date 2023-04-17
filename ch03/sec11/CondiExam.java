package ch03.sec11;

import java.util.Scanner;

public class CondiExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = 0;
/*
		char grade = (score > 90) ? 'A' : ((score > 80 ) ? 'B': 'C');
	*/
	
		Scanner stdIn = new Scanner(System.in);

		while(true)
		{
			System.out.print("점수를 입력하세요:");
			
			String str = stdIn.nextLine();
		
			if("q".equals(str) || "Q".equals(str))
				break;
		
			score = Integer.parseInt(str);
			
			if(score >= 90)
				grade = 'A';			
			else if(score >= 80)
				grade = 'B';
			else if(score >= 70)
				grade = 'C';
			else if(score >= 60)
				grade = 'D';
			else 	
				grade = 'F';
			
			System.out.println(score + "점은 "+ grade + "등급입니다" );

		}
		System.out.println("종료");
	}

}
