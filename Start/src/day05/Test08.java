package day05;

//1���� 6������ ����ϴ� �迭�� �����͸� ������ ����ϼ���.
//���� :
//	�迭: Ÿ���� ���� �����͸� ����������ŭ ��Ƽ� �ϳ��� �����ϵ��� �������� �ڹ��� ������Ÿ��
//	Ÿ���� �����Ǿ�� �ϰ� ������ ������ �Ǿ�� ���� �� �ִ�.


public class Test08 {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6}; // 1���� 6���� �����ϴ� �����迭
		
		// �迭 ���� �˾Ƴ���
		int len = num.length;
		
		for(int i = 0 ; i < len ; i++ ) {
			System.out.println((i + 1) + " ��° ������ : " + num[i]);
		}
		
		// ���� for ������� ó��
		for(int no : num) {
			System.out.println("### " + no);
		}
		
		System.out.println();
		
	}
	
}



	