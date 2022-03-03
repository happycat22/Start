package day07;

public class Test01 {

	public static void main(String[] args) {
		/* 정수 6개를 관리할 때 배열 arr을 만들고
		 1~6까지 채워서 한개씩 꺼너서 출력하세요.
		  
		 // 배열 변수 선언
		  배열 변수의 선언 형식 : 데이터타임 [] 변수;
//		 */
//		
		int[] arr;
//		// 배열 변수 초기화
		arr = new int[6];
//		
//		// 출력
//		// 참고: 배열의 길이를 알아내는 방법
		int len = arr.length;
		for(int i = 0; i<len; i++) {
//			//배열에 기억된 데이터 꺼내는 방법
//			// 배열 변수[위치값]
			int no = arr[i];
		System.out.println(no);
		}
		
//		블랙핑크 멤버의 이름을 기억할 배열을 만들어 출력하세요.
//		블랙핑크는 4명으로 구성되어 있습니다.
//		제니, 리사, 로제, 지수

		
		String[] blackpink = new String[4];
		for(int i = 0; i<blackpink.length;i++) {
			System.out.println(blackpink[i]);
		}
	}

}
