package Ex;
/*
문제 5 ]
	컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
	
	컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
	가위, 바위, 보로 가정하고/
	사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
	
	누가 이겼는지를 확인하는 프로그램을 작성하세요.
1. 랜덤하게 1~3 사이 숫자를 발생시키기
2. 사용자에게 숫자 입력받기
3. if문 이용하여 누가 이겻는지.. 짜내기

*/


import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력해주세요.%n 1.가위%n 2.바위%n 3.보%n");
		int user = sc.nextInt();
		int com = 0;
		
		com = (int)Math.random()*3 + 1;
		
		if((user ==1 && com == 1) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
			System.out.println("당신이 이겼습니다!");
		} else if((user ==1 && com == 1) || (user == 2 && com == 2) || (user == 3 && com == 3)) {
			System.out.println("무승부입니다."); // 다시 승부 보게 하려면 어떻게 해야할까?!	
		} else if(user >= 4) {
			System.out.println("보기의 숫자 중에서 골라주세요.");
		} else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
			System.out.println("당신이 졌습니다.");
		}
	}
}
		