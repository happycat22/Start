package day07;

import java.util.Arrays;

/*
 5������ ������ ����� �迭�� �����, 
 ���� ������ �Է��ؼ� ������ ����� ���ϰ�, ����ϼ���.
 �迭�� ��� ������ ���� ����ϼ���. 
 */

public class Test04 {
	public static void main(String[] args) {
		// ���� ���� �迭
		int[] subj = new int[5];
		for(int i=0; i<subj.length; i++) {	// ���� ������ �����ϰ� ���� �Է��Ѵ�.
			subj[i] = (int)(Math.random() * (100 - 60 + 1)+ 1);	// 60~100 ������ ����
			// ���� int score = (int)(Math.random() * (100 - 60 + 1)+ 1)
			// subj[i] = score;
		} 
		
		int total = 0;
		for(int  i = 0; i<subj.length; i++) {
			int score = subj[i];
			
			// ������ ���������� ������Ų��.
			
			total += score;
		}
		
		// ��� ���ϱ�
		double avg = total / (double)subj.length;
		System.out.println("�� ���� ����: " + Arrays.toString(subj));
		System.out.println("���� ������: " + total);
		System.out.println("���� ��� ����: " + avg);
	}
}
