package Ex;

/*
���� 6 ]
	�����ϰ� ������ ��ǻ�Ͱ� ����� ����
	�� ���� �˾Ƹ��ߴ� ������ ���弼��.
	
	�� ]
		
		�߻����� : 54
		
		������Է¼��� : 45
		
		==> "�Է��� ���� �� �۽��ϴ�."
		�� �޼��� �� ����ؼ� ����ڰ� ���ڸ� �˾Ƹ��ߴ� ����...
		
	��, �Է�Ƚ���� 5���� �ʰ��ϴ� ���� ��ǻ���� �¸��� ó���ϰ�
	���α׷��� ����ǰ� �ϼ���.
*/

import java.util.*;
public class Ex06_1 {
	public static void main(String[] args) {
		
		int com = 0;
		int user = 0;
		
		com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100������ ������ �Է��ϼ���.");
		
		for(int i = 0; i<5;i++) {
			user = sc.nextInt();
			if(user > com) {
				System.out.println("�� ���� ���� �־��ּ���.");
			} else if(user < com) {
				System.out.println("�� ū ���� �־��ּ���.");
			} else if (user == com){
				System.out.println("�����Դϴ�.");
			}
				
			}
		System.out.println("�Է�Ƚ���� �ʰ��Ͽ����ϴ�.");
		}		
	}

