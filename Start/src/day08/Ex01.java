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
			int[][] stud = new int[7][6];
			
			// �л����� ����� ����� �迭
			double[] avg = new double[7];
			// ����
			
			
			// �������� �����.
			for(int i=0; i<stud.length; i++) {
				/*
					�л��� �� ������ ���� ������ ���� ���̰�
					�׹��� �迭 ���鶧 0���� �ڵ� �ʱ�ȭ
				 */
				//System.out.printf("%3d", i+1); // ��ȣ
				// �ݺ��ؼ� ���� �����
				int sum = 0;
				for(int j=0; j< stud[i].length - 1; j++) {
					
					stud[i][j] = (int)(Math.random() * 41 + 60); // ���� ����
					sum += stud[i][j];	// �л� ���� ���ϱ�
//					System.out.printf("%5d", stud[i][j]); // ���� ���
				}
//				System.out.println();
				// ���� �Է�
				stud[i][5] = sum ;
				
				avg[i] = sum / (double) (stud[i].length - 1);
//				System.out.print(sum);
		}
			
		System.out.println("��ȣ ���� ���� ���� ��ȸ ���� ���� ���");
		System.out.println("===================================");
		// ���
		for(int i = 0 ; i < stud.length ; i++ ) { // i �� �л��� ��ġ��...
			System.out.print(" " + (i + 1) + "  ");
			
			// ���� �����ؼ� ���
			for(int j = 0 ; j < stud[i].length ; j++ ) {
				System.out.printf("%4d ", stud[i][j]);
			}
			System.out.println(avg[i]);
		}
	}
}
