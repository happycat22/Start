package day07;
/*
 10���� ������ �����ϰ� �߻����Ѽ� ����ϴ� �迭�� �����
 ���� ���� ���� ū ���� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
 */

import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		// �迭 �����
		int[] num = new int[10];
		// ������ ä���
		loop:
		for(int i = 0; i<num.length; i++) {
			int no = (int)(Math.random()*99+1);
			
			// �ߺ� �˻�
			for(int j = 0; j<i; j++) {
				if(num[j] == no) {
					// ������ ���� ��ȣ�� �ߺ��� �ǹǷ� �ٽ� ��ȣ�� �����.
					i--;
					continue loop;
					
				}
			}
			
			num[i] = no;
			
		}
		
		// ������ Ȯ��
		System.out.println(Arrays.toString(num));
		
		int max = num[0];
		for(int i = 1; i <num.length; i++) {
			int tmp = num[i];
			if(tmp > max) {
				max = tmp;
			}
		}
		
		// ���
		System.out.println("max : " + max);

	}

}
