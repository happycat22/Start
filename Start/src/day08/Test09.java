package day08;
/*
 +, -, *, /, % ������ �ϴ� ������� �Է��ϸ�
 ����� �����ִ� ���� ���α׷��� �ۼ��ϼ���.
 
 ��, ������� ���ڿ� �迭�� ��Ƽ� ó���ϼ���.
 
 �� :
 2 * 3
 String[] sik = new String[3]
 sik[0] = 2;
 sik[1] = *
 sik[2] = 3
 
 ���� ���� ��ȣ�� ���� ��ġ �������� ���ڿ��� �߶� ù��° ����Ű��,
 �����ȣ�� �ι�° ��ġ�� ����Ű��, �������� ������ ��ġ�� �����Ѽ� ó���Ѵ�.
 */

import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		
		// �Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		// �޽��� ���
		System.out.println("������ �Է��ϼ�ȿ�� : ");
		
		// �Է� �޾� ���
		String str = sc.nextLine();
		
		// �迭 �غ�
		String[] sik = new String[3];
		
		// �迭�� ���ڿ� �߶� ����ֱ�
		int idx = 0;	// ���� ��ȣ�� ��ġ���� ����� ����

		// �ݺ��ؼ� ������ ���� ��ȣ�� ��ġ�� ã�Ƴ���
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				// �� ��� ������ ���ڴ� ���������� ���ڰ� �ƴϹǷ�
				// �����ȣ�� �ش��Ѵ�.
				idx = i;
				
			}
		}
		
		sik[0] = str.substring(0, idx);
		sik[1] = str.substring(idx, idx +1); // or str.CharAt(idx) + ""
		sik[2] = str.substring(idx + 1);
		
		// ���
		int no1 = Integer.parseInt(sik[0]);
		int no2 = Integer.parseInt(sik[2]);
		
		double result = 0.0;
		
		switch(sik[1]) {
		case "+":
			result = no1 + no2;
			break;
			
		case "-":
			result = no1 - no2;
			break;
			
		case "*":
			result = no1 * no2;
			break;
			
		case "/":
			result = no1 / (double)no2;
			break;
			
		}
		
		// ��� ���
		System.out.println("�Է��� ����\n\t" + str + "\n�� ����� \n\t" + result);
	}

}
