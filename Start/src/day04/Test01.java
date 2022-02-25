package day04;

/*
  문제:
  정수 하나를 입력 받아서 이 수가 홀수인지 짝수인지를 판별하시오.
  
  참고:
  조건문
  if(조건식) {		// 조건식이 참일 경우 실행하는 부분
  	실행내용		
 */
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		/* 할일
		  1. 입력도구 준비
		  2. 입력 받기 전에 입력메시지 출력해주기
		  3. 조건에 따라서 판별하기
		  4. 내용 출력하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		String soo = "영";		// 조건에 따라 판별
		
		
		// 홀수인 경우
		if(num % 2 != 0) { // num % 2 == 1
			soo = "홀수";
			
		}
		
		// 짝수인 경우
		if(num != 0 && num % 2 == 0) {
			soo = "짝수";
		}
		
		System.out.println("입력받은 정수 " + num + "은 " + soo + "입니다.");
		
		
	}
}
