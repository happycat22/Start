package day06_Ex;

//���� 3
//���ڿ��� �Է� �޾Ƽ� ���ڸ� �� ���ھ� �����ؼ� ����ϼ���.
//���� : 
//	���ڿ��� ���̸� �˾Ƴ��� ��� : int ���� = ���ڿ�.length()

	
import java.util.*;

import javax.swing.JOptionPane;
public class Ex03 {

	public static void main(String[] args) {
		
//		// ���ڿ� �Է¹ޱ�
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڿ��� �Է��ϼ���");
//		String str = sc.nextLine();
//		
//		// �޼����� �� ���ھ� ���
//		
//		for(int i = 0; i<str.length(); i++) {
//			System.out.println("str[" + i + "] = " + str.charAt(i));
//		}
//	}
	
	String str = JOptionPane.showInputDialog("���ڿ��� �Է��ϼ���.");
	int len = str.length();
	for (int i = 0; i<len; i++) {
		char ch = str.charAt(i);
		System.out.println((i+1) + "��° ���� : [" + ch + "]");
	}
		
	}
	
}


//// ���ڿ����� ���ڸ� �� ���ھ� �����Ϸ���
//��ü ���ڿ��� ���̸� �˾Ƴ���
//�� ���̸�ŭ �ݺ��ؼ� �������ش�

//
//1. ���ڿ� �Է� �޾Ƽ� ���
//2. �Է¹��� ���ڿ��� ���� �˾Ƴ���
//3. ���̸�ŭ �ݺ��ؼ�  �� ���ھ� ����