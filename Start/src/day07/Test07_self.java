package day07;
import java.util.*;

public class Test07_self {
	/*
	 10���� ������ �����ϰ� �߻����Ѽ� ����ϴ� �迭�� �����
	 ���� ���� ���� ū ���� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
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