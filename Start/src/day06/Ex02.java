package day06;

/*
���� 2 ]
	�� ����� ����� �Ѵ�.
	�ѻ���� �� �Ա����� 0.54m/sec �� �ӵ��� ����� �����ϰ�
	�ѻ���� ���󿡼� 1.07m/sec �� �ӵ��� �����´�.
	���� ���̰� 7564m ��� �����ϸ�
	�� ����� ������ ������ ��� ���� ������ ����ϼ���.
*/

public class Ex02 {

	public static void main(String[] args) {
		float time = 0f; 
		int i = 0;
		int j = 0;
		for (i= 0; i<7564; i++) {
			for(j = 0; j<7564; j++) {
				System.out.println((1.07*j) - (0.54*i)); 
			}
			
		}
			

	}

}
