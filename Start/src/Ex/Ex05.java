package Ex;
/*
���� 5 ]
	��ǻ�Ϳ� ����� ������ ���������� ������ �Ѵ�.
	
	��ǻ�ʹ� �����ϰ� 1 ~ 3 ������ ���ڸ� �߻��Ͽ�
	����, ����, ���� �����ϰ�/
	����ڴ� Ű���带 �̿��ؼ� 1 ~ 3 ������ ���ڸ� �Է��ϵ��� �Ѵ�.
	
	���� �̰������ Ȯ���ϴ� ���α׷��� �ۼ��ϼ���.
1. �����ϰ� 1~3 ���� ���ڸ� �߻���Ű��
2. ����ڿ��� ���� �Է¹ޱ�
3. if�� �̿��Ͽ� ���� �̰����.. ¥����

*/


import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���ڸ� �Է����ּ���.%n 1.����%n 2.����%n 3.��%n");
		int user = sc.nextInt();
		int com = 0;
		
		com = (int)Math.random()*3 + 1;
		
		if((user ==1 && com == 1) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
			System.out.println("����� �̰���ϴ�!");
		} else if((user ==1 && com == 1) || (user == 2 && com == 2) || (user == 3 && com == 3)) {
			System.out.println("���º��Դϴ�."); // �ٽ� �º� ���� �Ϸ��� ��� �ؾ��ұ�?!	
		} else if(user >= 4) {
			System.out.println("������ ���� �߿��� ����ּ���.");
		} else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
			System.out.println("����� �����ϴ�.");
		}
	}
}
		