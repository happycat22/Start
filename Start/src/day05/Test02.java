package day05;
//
//정수를 입력 받아서
//그 숫자가 짝수인지 홀수인지 판별해서 출력하세요

// 입력 받을 준비
import java.util.*;

public class Test02 {
	public static void main(String[] args) {

		// 입력 메시지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		// 입력 받아서 변수에 기억
		
		// 판별하고
		String result = ""; // 짝수인지 홀수인지 기억할 변수
		
		if(num == 0) { // 0인 경우
			result = "0";
		}
		
		if (num % 2 ==0) {
			result = "짝수";
		}
		
		if (num % 2 != 0) {
			result = "홀수";
		}
			
		System.out.println("입력한 정수 " + num + "는 " + result + "입니다.");
		
//		if (num % 2 ==0) {
//			System.out.println("짝수입니다.");
//		} else if(num % 2 != 0){
//			System.out.println("홀수입니다.");
//		}
//		
		//결과 출력

	}

}
