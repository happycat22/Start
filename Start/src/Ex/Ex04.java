package Ex;
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
	
	1. 입력 받기 2. case문에 if를 추가해서 작성하기
*/
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		int basic = 0;
		int use = 0;
		int use_money = 0;
		int index = 0;
		
		Scanner sc = new Scanner(System.in); // 입력받기
		System.out.println("사용자 코드를 입력하세요.");
		index = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in); // 입력받기
		if(1<=index && index<=4) {
			System.out.println("사용량을 입력하세요.");
		}
		
			if(index == 1){
				sc2 = new Scanner(System.in); // 입력받기
			use = sc2.nextInt();
				if(use>=245) {
					use_money = 3800;				
				System.out.println("전기요금 = " + (basic + use * use_money)); //기본요금 + 사용량 * 사용요금
				}
			}
			else if(index == 2){
				sc2 = new Scanner(System.in); // 입력받기
				use = sc2.nextInt();
					if(use>=157) {
						use_money = 2400;				
						System.out.println("전기요금 = " + (basic + use * use_money)); 
						}
			}
					
			else if(index == 3){
				sc2 = new Scanner(System.in); // 입력받기
				use = sc2.nextInt();
					if(use>=169) {
						use_money = 2900;				
						System.out.println("전기요금 = " + (basic + use * use_money)); 
						}
			}
			else if(index == 4){
				sc2 = new Scanner(System.in); // 입력받기
				use = sc2.nextInt();
					if(use>=174) {
						use_money = 3200;				
						System.out.println("전기요금 = " + (basic + use * use_money)); 
					}
					
			} else {
				System.out.println("1~4 중에 입력해주세요.");
			}
	}
}
		
					
				
							
			

