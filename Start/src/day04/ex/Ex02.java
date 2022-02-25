package day04.ex;

import java.util.Scanner;

/*
 알파벳 문자를 임의로 랜덤하게 입력한 후,
 그 문자가 대문자이면 소문자로 소문자이면 대문자로 변환하고,
 만약 특수문자이면 그 문자 그대로 출력하는 프로그램을 작성하세요. 
 (삼항 연산자 사용)
 
 참고 )
 아스키 코드는
 특수문자 - 숫자(0 ~ 9) - 특수문자 - 영문대문자(A~Z) - 특수문자 - 소문자(a~z) - 특수문자


참고2)
문자열에서 문자를 추출하는 방법
문자열.charAt(위치값)
이때 위치값은 0부터 시작한다.abstract
	ex) "abcd"에서 두번째 문자를 추출하려면
		"abcd".charAt(1)  ==> 'b'
		
	'J' 
 */


public class Ex02 {
	public static void main(String[] args) {
		
		 //입력도구 준비하고
		Scanner sc = new Scanner(System.in);
//		 메세지 출력받기
		System.out.print("문자 입력 : ");
//		입력 받아 문자열 저장
		String str = sc.nextLine();
//		문자열에서 문자 추출
		char ch = str.charAt(0);
		
//		판별
		char result = (ch < 'A') ? (ch) : (
				(ch <= 'Z') ? ((char)(ch + ('a' - 'A'))) :
			(ch < 'a') ? (ch) : (
					(ch <= 'z') ? (char)(ch - ('a' - 'A')) : ch
							));
//		결과출력
			
	}
}