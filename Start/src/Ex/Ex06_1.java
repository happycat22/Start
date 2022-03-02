package Ex;

/*
문제 6 ]
	랜덤하게 정수를 컴퓨터가 만들어 내면
	그 수를 알아맞추는 게임을 만드세요.
	
	예 ]
		
		발생숫자 : 54
		
		사용자입력숫자 : 45
		
		==> "입력한 수가 더 작습니다."
		로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
		
	단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하고
	프로그램이 종료되게 하세요.
*/

import java.util.*;
public class Ex06_1 {
	public static void main(String[] args) {
		
		int com = 0;
		int user = 0;
		
		com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100까지의 정수를 입력하세요.");
		
		for(int i = 0; i<5;i++) {
			user = sc.nextInt();
			if(user > com) {
				System.out.println("더 작은 수를 넣어주세요.");
			} else if(user < com) {
				System.out.println("더 큰 수를 넣어주세요.");
			} else if (user == com){
				System.out.println("정답입니다.");
			}
				
			}
		System.out.println("입력횟수를 초과하였습니다.");
		}		
	}

