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
		
		Ƚ���� ���� ��µǰ� �ϼ���.
*/
import java.util.*;
public class Ex06 {
	public static void main(String[] args) {
		int answer = 0;		// ��ǻ�Ͱ� �� ��
		int input = 0;		// ����ڰ� �Է��� ��
		
		answer = (int)(Math.random()*100)+1; 	// 1~100���� ���� ���� �����
		Scanner sc = new Scanner(System.in);	// ����� �Է¶� �����
		
		do {
			System.out.println("1�� 100 ������ ������ �Է��ϼ���>"); 	// �Է� �ޱ�
			input = sc.nextInt();
			
			if (input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��ϼ���.");
			} else if (input<answer) {
				System.out.println("�� ū ���� �ٽ� �õ��ϼ���.");
			}
							
	} while (input != answer);
		System.out.println("�����Դϴ�.");
			
	}
	
}
