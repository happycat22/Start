package day04;
/*
 정수를 입력 받아서 짝수인지 홀수인지 판별하세요.
 단, 0은 짝수로 간주한다.
 */

import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//입력메시지 출력
		System.out.print("정수입력 : ");
		int num = sc.nextInt();		// 입력받아서 변수에 기억하고
		String result = (num % 2 == 0) ? "짝수" : "홀수";			//짝수인지 홀수인지 판별
		System.out.println("입력받은 숫자 [" + num + "]은 " + result + "입니다.");
	}
	
}
