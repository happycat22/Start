package day04.ex;

/*
 ���� 1-1 
1 ~ 25 �� ���� 3���� �����ϰ� �߻����Ѽ� 
�� ���� �� ���� ū ��, �߰���, �������� ����ϴ� ���α׷��� �ۼ��ϼ���
��, 3�� �����ڸ� ����ؼ� ó���ϼ���.
*/

public class Ex01_01 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random() * (25 - 1 + 1) +1);
	      int no2 = (int)(Math.random() * (25 - 1 + 1) +1);
	      int no3 = (int)(Math.random() * (25 - 1 + 1) +1);
	      
	      int temp = (no1 > no2) ? no1 : no2;
	      int max = (temp > no3) ? temp : no3;
	      
	      temp = (no1 < no2) ? no1 : no2;
	      int min = (temp < no3) ? temp : no3;
	      int mid = (no1 > no2) ? ((no1 > no3) ? ((no2 > no3) ? no2 : no3) : no1)
	      : ((no2 > no3) ? ((no1 > no3) ? no1 : no3) : no2);
	      
	      System.out.println("�Է��� �� ���� \n\t" + no1 + ", " + no2 + ", " + no3 + "�߿��� \n���� ū���� " 
	      + max + ", \n�߰� ���� " + mid + ", \n���� ���� " + min + " �Դϴ�.");

		
		      
			
				
	}
}
