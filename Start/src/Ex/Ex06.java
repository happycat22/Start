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
		
		횟수도 같이 출력되게 하세요.
*/
import java.util.*;
public class Ex06 {
	public static void main(String[] args) {
		int answer = 0;		// 컴퓨터가 낸 답
		int input = 0;		// 사용자가 입력한 답
		
		answer = (int)(Math.random()*100)+1; 	// 1~100까지 랜덤 정수 만들기
		Scanner sc = new Scanner(System.in);	// 사용자 입력란 만들기
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요>"); 	// 입력 받기
			input = sc.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도하세요.");
			} else if (input<answer) {
				System.out.println("더 큰 수로 다시 시도하세요.");
			}
							
	} while (input != answer);
		System.out.println("정답입니다.");
			
	}
	
}
