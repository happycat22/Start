package day05;


	//���̸� �Է¹޾Ƽ�
	//�����
	//10�� : 10~19
	//20��
	//30��
	//40�� : 40~49
	//�����
	//���� �����ؼ� ����ϼ���.

//1. �Էµ��� �غ�
//2. �޽��� ���
//3. �Է¹޾Ƽ� ���� ���
//4. �Ǻ��ؼ� ����� ������ ���
//5. ���

import java.util.*;
public class Test05 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���̸� �Է��ϼ���.");
			int age = sc.nextInt();
			
			String sage = "";
			
			int gen = age / 10 * 10;
			
			switch(gen) {
			case 0:
				sage = "�����";
				break;
			case 10:
				sage = "10��";
				break;
			case 20:
				sage = "20��";
				break;
			case 30:
				sage = "30��";
				break;
			case 40:
				sage = "40��";
				break;
			default:
				sage = "�����";
			}
			System.out.printf("����" + age + "�� " + sage + "�Դϴ�.");
			
		}
}
