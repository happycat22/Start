package day03.ex;

/* Q2) 하나의 숫자를 입력 받은 후 (원의 반지름)

 		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 		
 		참고)
 		원의 넓이 : 반지름 * 반지름 * 3.14
 		원의 둘레 : 2 * 반지름 * 3.14
 */

import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		int rad =sc.nextInt();
	//	String ban = sc.nextLine();
	//	double half = Integer.parseInt(ban);
		double pi = 3.14;
		double area = rad * rad * pi;
		double arround = 2 * rad * pi;
		System.out.println("넓이 : " + area); // 숫자 데이터의 연산은 항상 큰 데이터 타입을 결과로 같는다
		System.out.println("둘레 : " + arround);
	}
}


/* 과정
1. 입력도구 준비
2. 입력되기 전 메시지 출력
3. 입력 받는다.
4. 변수에 기억
5. 계산 및 출력
*/


