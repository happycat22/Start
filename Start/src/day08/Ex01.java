package day08;
/*
7�л��� 5���� ������ �����ϰ� ���� ����Ű��
�� �л� �迭�� �� ���������� ������ ����ؼ� �Էµǰ� �ϰ�
����� ����ϴµ�
��յ� ����ؼ� ����ϼ���.


*/

public class Ex01 {
	public static void main(String[] args) {
	// �л� �迭
			int[][] stud = new int[7][5];
			// ����
			System.out.println("��ȣ ���� ���� ���� ��ȸ ���� ����");
			System.out.println("===================================");

			for(int i=0; i<stud.length; i++) {
				int sum = 0; // ���� �ʱ�ȭ
				float avg = 0;  // ��� �ʱ�ȭ
				System.out.printf("%3d", i+1); // ��ȣ
				
				for(int j=0; j< stud[i].length; j++) {
					stud[i][j] = (int)(Math.random() * 41 + 60); // ���� ����
					sum += stud[i][j];	// �л� ���� ���ϱ�
					System.out.printf("%5d", stud[i][j]); // ���� ���
				}
				System.out.println();

				avg = sum / (float)stud[i].length;
//				System.out.print(sum);
				

				
		}
}
}
