package day06_Ex;
// p.170
/*
문제 7 ]
	5자리의 숫자를 입력한 후
	각자리의 수의 합을 구하는 프로그램을 작성하세요.
*/
//

import java.util.*;
public class Ex07 {
	public static void main(String[] args) {
		int sum = 0;
		int num =0;
		
		System.out.println("5자리 숫자를 입력하세요. ex)12345");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num !=0) {
			sum += num%10;
			num /= 10;	// num이 0이 되면 멈추게 하기 위한 식
		}	//시스 아웃을 포함 시키지 않아야 중복되지 않고, 한 번만 나온다.
			System.out.printf("각 자리수의 합은 " +sum+ "입니다");
			System.out.println();
			
		}
	}
