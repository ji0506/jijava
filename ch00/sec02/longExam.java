package ch00.sec02;

// int 값을 long 값으로 인식하게 하는 방법

public class longExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000; // int로 컴파일러가 인식하여 에러 
		long var4 = 1000000000000L; // ㅣ



		System.out.println(var1);
		System.out.print(var2+"\n");
		System.out.println(var4);

	}

}
