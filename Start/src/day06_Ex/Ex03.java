package day06_Ex;

//문제 3
//문자열을 입력 받아서 문자를 한 글자씩 추출해서 출력하세요.
//참고 : 
//	문자열의 길이를 알아내는 방법 : int 변수 = 문자열.length()

	
import java.util.*;

import javax.swing.JOptionPane;
public class Ex03 {

	public static void main(String[] args) {
		
//		// 문자열 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요");
//		String str = sc.nextLine();
//		
//		// 메세지를 한 글자씩 출력
//		
//		for(int i = 0; i<str.length(); i++) {
//			System.out.println("str[" + i + "] = " + str.charAt(i));
//		}
//	}
	
	String str = JOptionPane.showInputDialog("문자열을 입력하세요.");
	int len = str.length();
	for (int i = 0; i<len; i++) {
		char ch = str.charAt(i);
		System.out.println((i+1) + "번째 문자 : [" + ch + "]");
	}
		
	}
	
}


//// 문자열에서 문자를 한 글자씩 추출하려면
//전체 문자열의 길이를 알아내고
//그 길이만큼 반복해서 추출해준다

//
//1. 문자열 입력 받아서 기억
//2. 입력받은 문자열의 길이 알아내기
//3. 길이만큼 반복해서  한 글자씩 추출