package day08;

/*
 "black pink"��� ���ڿ��� ����ϴ� ���� str�� ����� �� �߿���
 1. Black�� �����ؼ� ���
 2. Pink�� �����ؼ� ���
 */

public class Test08 {

	public static void main(String[] args) {
		String str = "Black Pink";
		
		// �߶� �ܾ�� 
		String word1, word2;
		
		//Black ����
		//' '�� ��ġ
		int idx1 =str.indexOf(' '); // ���ڿ� �� Ư�� ������ ��ġ�� �˷��ִ� �Լ�
		word1 = str.substring(0, 5);
		word2 = str.substring(0, idx1);
	
		
		// Pink ����
		word2 = str.substring(str.indexOf('P'));
		
		// ���
		System.out.println(word1);
		System.out.println(word2);
	}

}
