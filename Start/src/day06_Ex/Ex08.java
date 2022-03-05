package day06_Ex;
/*
문제 8 ]
1바이트로 기억되는 2진수를 랜덤하게 만들어
		그숫자가 10진수로 몇인지출력하는 프로그램을 작성하세요.
		
		참고 ]
			문자열 2진수를 10진수 정수로 변환해주는 방법
				
				Integer.valueOf("문자열 2진수", 2);
				Integer.parseInt("문자열 2진수", 2);
		
		힌트 ]
			이진수 는 0과 1을 랜덤하게 발생시켜서 문자열에 덧붙여서 만든다.
*/

import java.util.*;
public class Ex08 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("다섯자리 숫자 입력 : ");
      
      String sno = sc.nextLine();
      
      //전체 길이
      int len = sno.length();
      
      //합 기억할 변수
      int sum = 0;
      
      
      for(int i = 0; i < len ; i++) {
         //각 자릿수 문자로 꺼내기
         char ch = sno.charAt(i);
         //문자를 숫자로 변환
         int num = ch - '0';
         //합계 변수에 누적
         sum += num;
         
      }
      
      //출력
      System.out.println("입력한 숫자 [ " + sno + " ] 의 합은 " + sum + "입니다. ");
   }

}