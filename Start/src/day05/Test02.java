package day05;
//
//������ �Է� �޾Ƽ�
//�� ���ڰ� ¦������ Ȧ������ �Ǻ��ؼ� ����ϼ���

// �Է� ���� �غ�
import java.util.*;

public class Test02 {
	public static void main(String[] args) {

		// �Է� �޽��� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		// �Է� �޾Ƽ� ������ ���
		
		// �Ǻ��ϰ�
		String result = ""; // ¦������ Ȧ������ ����� ����
		
		if(num == 0) { // 0�� ���
			result = "0";
		}
		
		if (num % 2 ==0) {
			result = "¦��";
		}
		
		if (num % 2 != 0) {
			result = "Ȧ��";
		}
			
		System.out.println("�Է��� ���� " + num + "�� " + result + "�Դϴ�.");
		
//		if (num % 2 ==0) {
//			System.out.println("¦���Դϴ�.");
//		} else if(num % 2 != 0){
//			System.out.println("Ȧ���Դϴ�.");
//		}
//		
		//��� ���

	}

}
