package day07;

import java.util.Arrays;

/*
 ���� 10 �����ϰ� ���� ����ϴ� �迭�� ����� 
 ���� ������ �������� �����ؼ� �ٽ� ����Ű�� 
 �迭�� �����͸� ����ϼ���.
 */

public class Test08 {

	public static void main(String[] args) {
		// �迭 �����
		int[] num = new int[10];
		//������ ä���
		
		loop:
		for(int i = 0; i<num.length; i++) {
			int no = (int)(Math.random()*99 +1);
			
			// �ߺ��˻�
			for(int j = 0; j <i; j++) {
				int soo = num[j];
				if(soo==no) {
					// �ߺ��Ǵ� ����̹Ƿ� ���� ������ �ٽ� �ݺ��Ѵ�.
					i--;
					continue;
				}
			}
			
			// �� ���� �����ϴ� ���� �ߺ� �˻翡 ����� ���
			num[i] = no;
			
		}
		System.out.println(Arrays.toString(num));
		
		// �����Ѵ�.
		for(int i = 0; i<num.length -1; i++) {
			int tmp = 0;
			for(int j = i + 1; j<num.length; j++) {
				
//				int pre = num[i];
//				int post = num[j];
//				if(post > pre) {
//					num[i] = post;
//					num[j] = pre;
//					
				if(num[j] > num[i]) {
					tmp = num[i];
					num[i] =num[j];
					num[j] = tmp;
					
				}
			}
		}
		
		// �迭 ���
		System.out.print("| ");
		for(int no : num) {
			System.out.print(no + " | ");
		}

	}
			//  ä���� ���� Ȯ��
		
}
