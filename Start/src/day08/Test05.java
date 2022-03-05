package day08;

public class Test05 {
	public static void main(String[] args) {
		// 문자열 배열을 만들어보자
		String[] str;
		str = new String[5];
//		위 처럼 하면 데이터가 초기화가 안 되어 있는 상태
//		 아직 인덱스가 비어있는 상태이다.
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]); // null로 나온다.
		}
		
//			~ String 배열 초기화 하는 법 ~
			String[] names = {"둘리", "제니", "리사", "로제", "지수"};
			
			
			
//			문자열도 필요에 따라 char[] 형태로 변환해서 사용할 수 있다.
//			방법:
//				toCharArray();
//				ex)
//				String name = "jenie";
//				char = name.toCharArray;
//						ch[0] ==> j
//						ch[1] ==> e
				
			}
		
	}


//Sting 클래스에서 자주 사용되는 함수.

