package day07;

import java.util.Arrays;

/*
5������ ������ ����� �迭�� �����, 
���� ������ �Է��ϰ� ������ �迭�� �������� ����ؼ� �Է��ϰ�
����� ���� ����ϼ���.
�迭�� ��� ���� ������ ���� ����ϼ���. 
*/

public class Test05 {
	public static void main(String[] args) {
		// ����
//		1. �迭�� �����.
		int[] subj = new int[6];
		// �� ������ �濡�� ������ ��� �Ǿ�� �ϹǷ� �� ��������� �����ؼ� ������ �Է��Ѵ�.
		for(int i =0; i<subj.length -1; i++) {
//			2. ���������� ���� �Է��Ѵ�.
			int score = (int)(Math.random()* 41 + 60); // 41 = 100 - 60 + 1
			subj[i] = score;
		}
		
		System.out.println(("1. " + Arrays.toString(subj)));
		
//		3. ������ ����ؼ� �Է��Ѵ�.
		for(int i = 0; i<subj.length -1; i++) {
//			subj[5] += subj[i]; 		// ������ �迭�� ������ �������� �����Ѵ�.
			subj[subj.length - 1] += subj[i]; // �̷��� ���� �� ���� �� �� ����.
		}
		
		System.out.println("2. " + Arrays.toString(subj));
		
//		4. ��� ���ؼ� ��� ��Ų��
		int no = subj.length -1;	// ������ ������ ���� ����� ������
		double avg = subj[subj.length-1] / (double)no;
		
//		5. ������ ����Ѵ�.
		System.out.println("�������� : ");
		for(int i = 0; i<subj.length-1; i++){// ���� ���� ���
			System.out.print(subj[i] + " | ");		
			}
		System.out.println();	// �ٹٲ�
		System.out.println("��    �� : " + subj[subj.length -1]);
		System.out.println("��    �� : " + avg);
		
		
		
	}
}
