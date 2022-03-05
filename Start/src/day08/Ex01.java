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
			int[][] stud = new int[7][5];
			// 목차
			System.out.println("번호 국어 수학 영어 사회 과학 총점");
			System.out.println("===================================");

			for(int i=0; i<stud.length; i++) {
				int sum = 0; // 총점 초기화
				float avg = 0;  // 평균 초기화
				System.out.printf("%3d", i+1); // 번호
				
				for(int j=0; j< stud[i].length; j++) {
					stud[i][j] = (int)(Math.random() * 41 + 60); // 랜덤 점수
					sum += stud[i][j];	// 학생 총점 구하기
					System.out.printf("%5d", stud[i][j]); // 총점 출력
				}
				System.out.println();

				avg = sum / (float)stud[i].length;
//				System.out.print(sum);
				

				
		}
}
}
