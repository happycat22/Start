package Ex;

/*
���� 13 ]
	������ �� ���� �Է��� ��
	�� ���� �ִ� ������� ���ϴ� ���α׷��� �ۼ��ϼ���.
	
	�ִ� ����� :
		�� ���� ����� ���� ū ��.
		�� ���� ���� �� �ִ� ���� ���� ū ��
		
		1. ���� �Է� �޴´�. 2. �� ���� ������ 
		
	extra ]
		�� ������ �ذ�Ǹ� �ּҰ������ ���ϴ� ������ Ǯ�����.
*/

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1�� �Է¸޼���
		System.out.print("ù��° ���� : ");
		// 1�� ������ ���
		int no1 = sc.nextInt();
		
		// 2�� �Է¸޼���
		System.out.print("�ι�° ���� : ");
		// 2�� ������ ���
		int no2 = sc.nextInt();
		
		// �� ���� ���� ���� ã�´�.
		int min = (no1 < no2) ? no1 : no2;
		
		int result = 1;
		
		// ����� ã��
		for(int i = min; i > 1 ; i-- ) {
			if(no1 % i == 0 && no2 % i == 0) {
				result = i;
				// ���ϴ� ���ڸ� ã�����Ƿ� ���̻� �ݺ��۾��� �� ������ ����.
				// ���� ��� �ݺ����� �����Ų��.
				break;
			}
		}
		
		// ��� ����ϱ�
		System.out.println("�Է¹��� �� �� " + no1 + " | " + no2 + 
								" �� �ִ� ������� " + result + " �Դϴ�.");
	}

}
