package day07;

import java.util.Arrays;

/*
 6���� �޸𸮸� �迭�� ����� �� �ȿ� ������ ���ڸ� �Է��� �� ����ϼ���. 

 1~45������ ���ڸ� �ߺ����� �ʴ� ������ �������� �̾ƶ� 
  
 */
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		//����    
		
		int[] lotto = new int[6];		// 1. ���� �ʱ�ȭ 2. �迭 �����
		
		loop:
		for(int i = 0; i<lotto.length; i++) {
			int no = (int)(Math.random()*45 +1);	// 3. �����ϰ� ���ڸ� ����
			
		
		// �ߺ� �˻�
		// ���� ���� ��ȣ�� ������ �̹� ������� ��ȣ�� ���� ȸ���� �ݺ��Ѵ�.
		// ���� ȸ���� �ٽ� �ݺ��Ѵ�
		
		for(int j=0; j<i; j++) {			
			int tmp = lotto[j];		//������ ���� ��ȣ ����
			if(no==tmp) {
						// �̰��� ���� ���� ��ȣ�� ����ȸ������ �̹� ���� ��ȣ�̹Ƿ� ���� ȸ���� �ٽ� �ݺ��Ѵ�.
				i--;	// ȸ���� 1 ���� �����ش�.
				
				continue loop;	// ���� ȸ���� �����Ѵ�.
		}
	}
		
		lotto[i] = no;	//4. �迭 ä���ֱ�
	}
		
			for(int i =0; i<lotto.length; i++) {
				System.out.print((lotto[i] + " | ")); 	// 5. �ϳ��� ���
			}
			
			System.out.println();
		
	}

}
