package day06_Ex;
// p.170
/*
���� 7 ]
	5�ڸ��� ���ڸ� �Է��� ��
	���ڸ��� ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
*/
//

import java.util.*;
public class Ex07 {
	public static void main(String[] args) {
		int sum = 0;
		int num =0;
		
		System.out.println("5�ڸ� ���ڸ� �Է��ϼ���. ex)12345");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num !=0) {
			sum += num%10;
			num /= 10;	// num�� 0�� �Ǹ� ���߰� �ϱ� ���� ��
		}	//�ý� �ƿ��� ���� ��Ű�� �ʾƾ� �ߺ����� �ʰ�, �� ���� ���´�.
			System.out.printf("�� �ڸ����� ���� " +sum+ "�Դϴ�");
			System.out.println();
			
		}
	}
