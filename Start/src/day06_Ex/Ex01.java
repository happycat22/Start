package day06_Ex;
//
//1~10 ������ ���� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
//��Ʈ :  ���� ����� ������ ���� ó���ϼ���

//1. ����� ���� �����
//2. �ݺ��ؼ� ���� ����
//3. ��� ���

public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		int[] num = {100, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i<10; i++) {
			sum += i+1;
			
		}

		System.out.println("1~10������ ���� " + sum + "�Դϴ�.");
	}

}
