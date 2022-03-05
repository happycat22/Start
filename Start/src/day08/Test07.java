package day08;
/*
 문자 다섯개를 기억할 배열을 만들고,
 보기를 입력해놓고  문제와 같이 화면에 출력하고
 사용자가 정답을 입력하도록 해서 답안이 맞았는지 확인하는 프로그램을 만드세요.
 */
import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		// 문제변수
		String quest = "다음 중 블랙핑크 멤버가 아닌 사람은?";
		// 따로 변수 빼는 대신에 인덱스에 포함해서 출력해도 OK
		
		// 보기변수
		String[] ans = new String[5];
		// 보기입력
		ans[0] = "제니";
		ans[1] = "둘리";
		ans[2] = "리사";
		ans[3] = "로제";
		ans[4] = "지수";
		
		// 정답 위치값 변수
		int dap = 1;
		System.out.println();
		
		// 문제가 완성 됐으므로
		System.out.println(quest); 
		// 보기출력
		for(int i=0; i<ans.length; i++) {
			System.out.println((i +1) +  ")" +"\t" + ans[i]);
		}
		
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력메시지
		System.out.println("선택번호 : ");
		// 입력 받아서 변수에 기억
		int no = sc.nextInt() -1;
		
		// 정답과 비교해서 결과 출력
		String result = no == dap ? "정답" : "오답";
		
		// 결과 출력
		System.out.println("선택한 멤버 " + ans[no] + "는 " + result + "입니다.");
		

	}

}
