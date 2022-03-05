package day05;

//1부터 6까지를 기억하는 배열의 데이터를 꺼내서 출력하세요.
//참고 :
//	배열: 타입이 같은 데이터를 일정갯수만큼 모아서 하나로 관리하도록 만들어놓은 자바의 데이터타입
//	타입이 결정되어야 하고 갯수도 결정이 되어야 만들 수 있다.


public class Test08 {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6}; // 1부터 6까지 관리하는 정수배열
		
		// 배열 갯수 알아내고
		int len = num.length;
		
		for(int i = 0 ; i < len ; i++ ) {
			System.out.println((i + 1) + " 번째 데이터 : " + num[i]);
		}
		
		// 향상된 for 명령으로 처리
		for(int no : num) {
			System.out.println("### " + no);
		}
		
		System.out.println();
		
	}
	
}



	