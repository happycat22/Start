package day07;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		char[] ch = new char[10];
		
	// �� �濡 ���ʷ� �����ؼ� �ϳ��� ���ڸ� ä���ش�
		for(int i = 0; i<ch.length; i++) {
			//���� �����
			char munja = (char)('A' + i);
			// ������� ���ڸ� �迭�� ä�� �ִ´�
			ch[i] = munja;
		}
		
		// �迭�� ���� Ȯ��
		System.out.println(Arrays.toString(ch));
		
		// �ϳ��� ������ ��� 
		for(char munja : ch) {
			System.out.print(munja + " | ");
		}
	}
}
