package day06_Ex;
/*
���� 8 ]
1����Ʈ�� ���Ǵ� 2������ �����ϰ� �����
		�׼��ڰ� 10������ ����������ϴ� ���α׷��� �ۼ��ϼ���.
		
		���� ]
			���ڿ� 2������ 10���� ������ ��ȯ���ִ� ���
				
				Integer.valueOf("���ڿ� 2����", 2);
				Integer.parseInt("���ڿ� 2����", 2);
		
		��Ʈ ]
			������ �� 0�� 1�� �����ϰ� �߻����Ѽ� ���ڿ��� ���ٿ��� �����.
*/

import java.util.*;
public class Ex08 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("�ټ��ڸ� ���� �Է� : ");
      
      String sno = sc.nextLine();
      
      //��ü ����
      int len = sno.length();
      
      //�� ����� ����
      int sum = 0;
      
      
      for(int i = 0; i < len ; i++) {
         //�� �ڸ��� ���ڷ� ������
         char ch = sno.charAt(i);
         //���ڸ� ���ڷ� ��ȯ
         int num = ch - '0';
         //�հ� ������ ����
         sum += num;
         
      }
      
      //���
      System.out.println("�Է��� ���� [ " + sno + " ] �� ���� " + sum + "�Դϴ�. ");
   }

}