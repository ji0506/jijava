package ch00.sec02;


//연산 우선순위를 우선도

public class test01 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 5;

		System.out.println((b+c) * a/b);
		System.out.println(b+c * a/b);

	}

}
