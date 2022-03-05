package day08;

/*
 블랙핑크 멤버들의 이름을 기억할 배열을 만들고, 이름을 입력해서 출력하세요.
 */

public class Test06 {

	public static void main(String[] args) {
		String[] bp = new String[4];
//		System.out.println();		
		
		bp[0] = "제니";
		bp[1] = "지수";
		bp[2] = "로제";
		bp[3] = "리사";
		
		for(int i=0; i<bp.length; i++) {
			System.out.print(bp[i]);
		}
		System.out.println();
		
		 String[] bla = {"지수", "제니", "로제", "리사"};
		 	for(String str : bla)
		 		System.out.print(str);

	}

}
