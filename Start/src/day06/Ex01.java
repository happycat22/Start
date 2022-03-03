package day06;
/*
 문제 1
 3 ~ 100 사이의 정수를 입력 받아서 이 정수가 소수인지 판단하는 프로그램을 작성하세요.
 참고: 
 소수란, 1과 자신으로만 나눠지는 수. 
 
 보너스 ]
		3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
 */

import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3~100사이의 정수를 입력하세요.");
		int num = sc.nextInt();
		
		int count=0;
		for(num = 3;num<=100;num++) {
			for(int j=3;j<=num; j++) {
				if(num%j==0) {
					count ++;
					if(count == 1) {
						System.out.println("소수입니다.");
					} else if(count != 1){
						System.out.println("소수가 아닙니다.");
				}
			}
		}
			
				
			
	}
		

}

}
