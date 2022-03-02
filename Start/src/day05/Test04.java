package day05;

//나이를 입력받아서
//유년기
//10대 : 10~19
//20대
//30대
//40대 : 40~49
//장년층
//으로 구분해서 출력하세요.

import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		
		// 조건이 여러가지인 경우는 if~else if 구문으로 처리하는 것이 편하다
		
//		할일
//		1. 입력도구 준비
//		2. 메시지 출력
//		3. 입력받아 변수 기억
//		4, 판별 후 결과 기억
//		4. 결과 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		String sage = " ";
		
		if (age >= 50) {
			sage = "장년층";
		
		}else if (age >= 40) {
			sage = "40대";
		}else if (age >= 30) {
			sage = "30대";
		}else if (age >= 20) {
			sage = "20대";
		}else if (age >= 10) {
			sage = "10대";
		}else {
			sage = "유년기";
		}
		System.out.println("입력나이 : " +age);
		System.out.println(sage + "입니다.");
		
	}

}
