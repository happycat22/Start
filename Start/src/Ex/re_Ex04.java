package Ex;

import java.util.*;
public class re_Ex04 {
	/* ���� 4 ]
			�������� ������ִ� ���α׷��� �ۼ��ϼ���.
			
			������ǥ
				
							�ڵ�		�⺻���		�����
				������		1			3800			245
				�����		2			2400			157
				������		3			2900			169
				�����		4			3200			174
				
				
			�������� 
				�⺻��� + ��뷮 * �����
				
			����� �ڵ�� ��뷮�� �Է��ϸ�
			�������� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
			
			1. �Է� �ޱ�  (����� �ڵ� / ��뷮)
		*/


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("����� �ڵ带 �Է��ϼ���%n 1.������%n 2.�����%n 3.������%n 4.�����" );
		System.out.println();
		int code = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("��뷮�� �Է��ϼ���");
		int use = sc2.nextInt();
		
		int basic = 0;
		int total = 0;
		int cash = 0;
		
		if (code == 1) {
			basic = 3800;
			cash = 245;
		} else if (code == 2) {
			basic = 2400;
			cash = 157;
		} else if(code == 3) {
			basic = 2900;
			cash = 169;
		} else if (code == 4) {
			basic = 3200;
			cash = 174;
		} else {
			System.out.println("1~4 ������ �Է����ּ���.");
		}
		total = basic + use * cash;
		
		System.out.printf("����� ��� ����� %d �Դϴ�.", total);
	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("����� �ڵ带 �Է��ϼ���%n 1.������%n 2.�����%n 3.������%n 4.�����" );
//		System.out.println();
//		int code = sc.nextInt();
//		
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("��뷮�� �Է��ϼ���");
//		int use = sc2.nextInt();
//		 
//		switch(code) {
//		case : 1
//			System.out.println("�Էµ� �ڵ�� �������̰�, ��뷮�� " + use + "�̰�\n �������� " + (2800 + 245 * use) + "�Դϴ�.");
		
//		case���� �����ϴ�.
		}
		
	}


