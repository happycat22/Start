package day08;
/*
7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
결과를 출력하는데
평균도 계산해서 출력하세요.


*/

public class Ex01 {
	public static void main(String[] args) {
	// 학생 배열
			int[][] stud = new int[7][6];
			
			// 학생들의 평균을 기억할 배열
			double[] avg = new double[7];
			// 목차
			
			
			// 점수부터 만든다.
			for(int i=0; i<stud.length; i++) {
				/*
					학생의 맨 마지막 방은 총점이 들어가는 방이고
					그방은 배열 만들때 0으로 자동 초기화
				 */
				//System.out.printf("%3d", i+1); // 번호
				// 반복해서 점수 만들고
				int sum = 0;
				for(int j=0; j< stud[i].length - 1; j++) {
					
					stud[i][j] = (int)(Math.random() * 41 + 60); // 랜덤 점수
					sum += stud[i][j];	// 학생 총점 구하기
//					System.out.printf("%5d", stud[i][j]); // 총점 출력
				}
//				System.out.println();
				// 총점 입력
				stud[i][5] = sum ;
				
				avg[i] = sum / (double) (stud[i].length - 1);
//				System.out.print(sum);
		}
			
		System.out.println("번호 국어 수학 영어 사회 과학 총점 평균");
		System.out.println("===================================");
		// 출력
		for(int i = 0 ; i < stud.length ; i++ ) { // i 는 학생의 위치값...
			System.out.print(" " + (i + 1) + "  ");
			
			// 점수 추출해서 출력
			for(int j = 0 ; j < stud[i].length ; j++ ) {
				System.out.printf("%4d ", stud[i][j]);
			}
			System.out.println(avg[i]);
		}
	}
}
