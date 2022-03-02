package Ex;

import java.util.*;
public class re_Ex04 {
	/* 문제 4 ]
			전기요금을 계산해주는 프로그램을 작성하세요.
			
			전기요금표
				
							코드		기본요금		사용요금
				가정용		1			3800			245
				산업용		2			2400			157
				교육용		3			2900			169
				상업용		4			3200			174
				
				
			전기요금은 
				기본요금 + 사용량 * 사용요금
				
			사용자 코드와 사용량을 입력하면
			전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
			
			1. 입력 받기  (사용자 코드 / 사용량)
		*/


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("사용자 코드를 입력하세요%n 1.가정용%n 2.산업용%n 3.교육용%n 4.상업용" );
		System.out.println();
		int code = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("사용량을 입력하세요");
		int use = sc2.nextInt();
		
		int basic = 0;
		int total = 0;
		int cash = 0;
		
		if (code == 1) {
			basic = 3800;
			cash = 245;
		} else if (code == 2) {
			basic = 2400;
			cash = 157;
		} else if(code == 3) {
			basic = 2900;
			cash = 169;
		} else if (code == 4) {
			basic = 3200;
			cash = 174;
		} else {
			System.out.println("1~4 내에서 입력해주세요.");
		}
		total = basic + use * cash;
		
		System.out.printf("당신의 사용 요금은 %d 입니다.", total);
	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("사용자 코드를 입력하세요%n 1.가정용%n 2.산업용%n 3.교육용%n 4.상업용" );
//		System.out.println();
//		int code = sc.nextInt();
//		
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("사용량을 입력하세요");
//		int use = sc2.nextInt();
//		 
//		switch(code) {
//		case : 1
//			System.out.println("입력된 코드는 가정용이고, 사용량은 " + use + "이고\n 전기요금은 " + (2800 + 245 * use) + "입니다.");
		
//		case문도 가능하다.
		}
		
	}


