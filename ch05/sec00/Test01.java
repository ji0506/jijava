package ch05.sec00;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcullate(4,3,'+');
		//		int result = calcullate(4,3,'+');		
//		System.out.println(result);
	}

	static void calcullate(int n,int y, char cal)
	{
		switch(cal)
		{
		case '+':
			System.out.print("사칙연산 + : " + n + " + " + y + " = " + (n+y));
			break;
		case '-':
			System.out.print("사칙연산 - : " + n + " - " + y+ " = " + (n-y));
			break;
		case '*':
			System.out.print("사칙연산 * : " + n + " * " + y + " = " + (n*y));
			break;
		case '/':
			System.out.print("사칙연산 / : " + n + " / " + y + " = " + (n/y));
			break;
		}
		
//		return 0;
	}
	
}
