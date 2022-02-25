package day04;
/*
 
 1 ~ 25 사이에 정수를 랜덤하게 발생시켜서
 그 숫자가 짝수인지 홀수인지 판별해서 출력하세요
 
 참고)
 특정 범위의 랜덤한 숫자를 발생하는 방법
 Math 클래스 내에 0 포함 1 미만 실수를 발생시켜주는 함수 
 	Math.random()
 	
 형식:
 a ~ b 사이의 랜덤한 정수 (b > a라 가정)
 (int) (Math.random * (큰수 - 작은수 + 1) + 작은수)
 */


public class Test05 {
	public static void main(String[] args) {
		int no = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 숫자 판별하고 
		String result = (no % 2 == 0) ? "짝수" : "홀수";
		// 출력하고
		System.out.println("1 ~ 25 사이의 랜덤하게 발생된 숫자 " 
		+ no + "는 " + result + "입니다.");
		
		
	}
	
}
