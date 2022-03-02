package day04.ex;
/*
  1 ~ 25 의 숙자 3개를 랜덤하게 발생시켜서 
  그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요
  단, 3항 연산자를 사용해서 처리하세요.
 */

import java.util.*;
public class Ex01 {

		public static void main(String[] args) {
			int no1 = (int)(Math.random() * (25 - 1 + 1) + 1); //Math.random() + 25 + 1
			// 보너스 문제: -100 ~ 100 사이의 정수를 랜덤하게 발생시켜보세요.
			int no2 = (int)(Math.random() * (25 - 1 + 1) + 1); //Math.random() + 25 + 1
			int no3 = (int)(Math.random() * (25 - 1 + 1) + 1); //Math.random() + 25 + 1
			 
	// 판별한다.	
		int max = (no1 > no2) ? (
				(no1 > no3) ? no1 : no3
				) : (
					(no2 > no3) ? no2 : no3
				);
				
				System.out.println("'입력한 세정수 \n\t" + no1 + ", " + no2 + ", " + no3 + "\n중  제일 큰 수는 " + max);
				
			
		
		}
}
