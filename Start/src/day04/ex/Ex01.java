package day04.ex;
/*
  1 ~ 25 �� ���� 3���� �����ϰ� �߻����Ѽ� 
  �� ���� �� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���
  ��, 3�� �����ڸ� ����ؼ� ó���ϼ���.
 */

import java.util.*;
public class Ex01 {

		public static void main(String[] args) {
			int no1 = (int)(Math.random() * (25 - 1 + 1) + 1); //Math.random() + 25 + 1
			// ���ʽ� ����: -100 ~ 100 ������ ������ �����ϰ� �߻����Ѻ�����.
			int no2 = (int)(Math.random() * (25 - 1 + 1) + 1); //Math.random() + 25 + 1
			int no3 = (int)(Math.random() * (25 - 1 + 1) + 1); //Math.random() + 25 + 1
			 
	// �Ǻ��Ѵ�.	
		int max = (no1 > no2) ? (
				(no1 > no3) ? no1 : no3
				) : (
					(no2 > no3) ? no2 : no3
				);
				
				System.out.println("'�Է��� ������ \n\t" + no1 + ", " + no2 + ", " + no3 + "\n��  ���� ū ���� " + max);
				
			
		
		}
}
