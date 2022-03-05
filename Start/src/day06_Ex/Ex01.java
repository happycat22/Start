package day06_Ex;
//
//1~10 까지의 합을 구해서 출력해주는 프로그램을 작성하세요.
//힌트 :  합은 결과값 변수로 만들어서 처리하세요

//1. 결과값 변수 만들기
//2. 반복해서 누적 대입
//3. 결과 출력

public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		int[] num = {100, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i<10; i++) {
			sum += i+1;
			
		}

		System.out.println("1~10까지의 합은 " + sum + "입니다.");
	}

}
