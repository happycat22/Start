package day05;

//���̸� �Է¹޾Ƽ�
//�����
//10�� : 10~19
//20��
//30��
//40�� : 40~49
//�����
//���� �����ؼ� ����ϼ���.

import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		
		// ������ ���������� ���� if~else if �������� ó���ϴ� ���� ���ϴ�
		
//		����
//		1. �Էµ��� �غ�
//		2. �޽��� ���
//		3. �Է¹޾� ���� ���
//		4, �Ǻ� �� ��� ���
//		4. ��� ���
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int age = sc.nextInt();
		String sage = " ";
		
		if (age >= 50) {
			sage = "�����";
		
		}else if (age >= 40) {
			sage = "40��";
		}else if (age >= 30) {
			sage = "30��";
		}else if (age >= 20) {
			sage = "20��";
		}else if (age >= 10) {
			sage = "10��";
		}else {
			sage = "�����";
		}
		System.out.println("�Է³��� : " +age);
		System.out.println(sage + "�Դϴ�.");
		
	}

}
