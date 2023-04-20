package ch05.sec11;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			return;
		}
		
		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];

		
		int num1= Integer.parseInt(str1);
		int num2= Integer.parseInt(str2);
		int num3= Integer.parseInt(str3);

		int result = num1 + num2 + num3;
		
		System.out.println(num1 + " + " + num2 +  " + " + num3 + " = " + result );
	}

}
