package day03.ex;

/* Q1.  두개의 숫자를 입력 받은 후(가로, 세로)

		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구해서 결과를 출력하세요.abstract
		
		출력형식: 
		가로 : XXXX
		세로 : XXXX
		사각형 넓이 : XXXX  ==> 가로X세로
		삼격형 넓이 : XXXX.X ==> 가로X세로/2
*/

import java.util.*; // 자바에서 * 의 의미
					// 1) 연산자 곱하기의 의미 
					// 2) 모든 것을 의미

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		String garo = sc.nextLine(); // 문자열로 입력받는 방법
		// 문자열을 정수로 변환하는 방법
		// Integer.parseInt(문자열);
		int width = Integer.parseInt(garo);
		
		
		// 출력
		System.out.println("입력된 가로 : " + (garo + 20));
		System.out.println("입력된 정수 가로: " + (width + 20));
		
		/* 
		 * 정수로 입력받는 방법
		 * 	int 변수이름 = sc.nextInt();
		 */
		
		System.out.print("세로 : ");
		int sero = sc.nextInt();
				
		System.out.println("입력된 세로 : " + sero);
		System.out.println("사각형 넓이 : " + (width * sero));
		System.out.println("삼각형 넓이 : " + (double)(width * sero * 0.5));
	}
}
