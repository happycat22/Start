package day07;
import java.util.*;

public class Test07_self {
	/*
	 10개의 정수를 랜덤하게 발생시켜서 기억하는 배열을 만들고
	 기억된 수중 가장 큰 수를 알아내는 프로그램을 작성하세요.
	 */

	public static void main(String[] args) {
		
		int[] num = new int[10];

		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*99+1);
			
		}
		
		System.out.print(Arrays.toString(num));
		System.out.println();
		
			int max = num[0];
			for(int i = 0; i<num.length; i++) {
				if(num[i] > max) {
					max = num[i];
				}
				
			
		}
			System.out.println(max);
		
	}
}