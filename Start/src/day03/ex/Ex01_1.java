package day03.ex;
/*
 두개의 숫자를 입력 받은 후(가로, 세로)
 그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구해서 결과를 출력
 출력형식: 
		가로 : XXXX
		세로 : XXXX
		사각형 넓이 : XXXX  ==> 가로X세로
		삼격형 넓이 : XXXX.X
*/

import java.util.*;
public class Ex01_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// 입력도구 불러오기
		System.out.println("가로 : ");				// 입력메세지
		int width = sc.nextInt();					// 가로길이 입력
		

		System.out.println("세로 : ");				// 입력메세지
		int sero = sc.nextInt();					// 세로길이 입력
		
		System.out.println("사각형 넓이 : " + (width * sero));		// 사각형 넓이 구하기
		System.out.println("삼각형 넓이 : " + (width * sero)/2);	// 삼각형 넓이 구하기
		
		
	}

}
