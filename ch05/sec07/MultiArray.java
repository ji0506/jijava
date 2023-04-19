package ch05.sec07;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		
		for(int i=0;i < mathScores.length;i++){
			for(int k=0;k < mathScores[i].length;k++) {
				System.out.println("mathScores["+ i + "][" + k + "]: " + mathScores[i][k] );				
			}
		}
		System.out.println();

		int totalStudent = 0;
		int totalMathSum = 0;
		
		for(int i = 0; i <mathScores.length;i++) {
			totalStudent +=mathScores[i].length;
			for(int k=0;k < mathScores[i].length;k++) {
				totalMathSum += mathScores[i][k];
			}
		}
		
		double totalMathAvg = (double) totalMathSum/ totalStudent;
		System.out.println("천체 학생의 수학 평균 점수:" + totalMathAvg);
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 84;

		
		for(int i=0;i < englishScores.length;i++){
			for(int k=0;k < englishScores[i].length;k++) {
				System.out.println("englishScores["+ i + "][" + k + "]: " + englishScores[i][k] );				
			}
		}
		
		System.err.println();
		
		
		totalStudent = 0;
		int totalEngSum = 0;
		for(int i = 0; i <englishScores.length;i++) {
			totalStudent +=englishScores[i].length;
			for(int k=0;k < englishScores[i].length;k++) {
				totalEngSum += englishScores[i][k];
			}
		}
		double totalengavg = (double) totalEngSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수 : " + totalengavg);
	}

}
