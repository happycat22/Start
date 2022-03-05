package day07;
/*
 1~10���� ������ ������� �迭�� ����Ű�� 
 �� ���ڸ� �����ϰ� ��� ��µǵ��� �ϼ���.
 
 ��� : �迭�� Ư�� ��ġ 2���� ������ �����͸� �ٲ۴�
 �� ������ ���� �ϸ� �Ҽ��� �����Ͱ� ���̰� �ȴ�.
 */


public class Test06 {
	public static void main(String[] args) {
		// 1~10�� ����ϴ� �迭�� �����
		int[] num = new int[10];
		for(int i = 0; i<10; i++) {
			num[i] = i +1;
		}
		
		for(int no : num) {
			System.out.print(no + " | ");
		}
		System.out.println();
		
		// �迭 �غ� ��.
		// ������ ���� �� ���� �������� ���´�.(swapping)
		
		for(int i = 0; i<100;i++) {
			int idx1 = (int)(Math.random() * 10);
			int idx2 = (int)(Math.random() * 10);

			if(idx1 == idx2) {
				i--;
				continue;
			}
			// ���� ù��ġ�� �����͸� ������ ����Ű�� ����
			
			int tmp = num[idx1];
			num[idx1] = num[idx2];
			num[idx2] = tmp;
		}
			//���
			for(int no : num) {
				System.out.print(no + " | ");
			}
			System.out.println();
		}
	}


