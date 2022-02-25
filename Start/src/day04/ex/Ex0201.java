package day04.ex;
/*
 문제1)
 알파벳을 입력받아서 그 문자가 
 대문자인지 소문자인지 판별하는 프로그램을 작성하세요
 
 2) 숫자 또는 알파벳을 입력 받아서
 그 문자가 숫자인디 대문자인지 소문자인지 판별하는 프로그램을 작성하세요
 */
import java.util.*;
public class Ex0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요.");
		String Str = sc.nextLine();
		System.out.println(Character.isUpperCase(Str.charAt(0)));
		System.out.println(Character.isLowerCase(Str.charAt(0)));
		
	
	}

}
