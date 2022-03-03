package day07;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		char[] ch = new char[10];
		
	// 각 방에 차례로 접근해서 하나씩 문자를 채워준다
		for(int i = 0; i<ch.length; i++) {
			//문자 만들고
			char munja = (char)('A' + i);
			// 만들어진 문자를 배열에 채워 넣는다
			ch[i] = munja;
		}
		
		// 배열의 내용 확인
		System.out.println(Arrays.toString(ch));
		
		// 하나씩 꺼내서 출력 
		for(char munja : ch) {
			System.out.print(munja + " | ");
		}
	}
}
