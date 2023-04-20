package ch05.sec07;

public class Test01 {
	public static void main(String[] args) {
		int[] oldArr = {1,2,3};
		int[] newArr = new int[5];
		
		for(int i =0; i < oldArr.length;i++) {
			newArr[i] = oldArr[i];
		}
		for(int i =0; i < oldArr.length;i++) {
			System.out.print(newArr[i] + " ");
		}

	}
}
