package day08;

/*
 �����ϰ� �ټ����� �л��� ������ ����� �迭�� ����Ű��
 �� �л��� ������ ����� �迭�� ���� ����� ����ϼ���.
 */
public class Test02 {

	public static void main(String[] args) {
		// �ټ����� ������ ����� �迭�� �����.
		int[] score = new int[5]; // �迭 �����
		
		// ������ ����� �迭�� �����.
		int[] stud = new int[5];
		// �ʱⰪ �����ϰ�
		for(int i = 0; i<stud.length; i++){
			stud[i] = 1;
			
		}
		
		// ������ �����ϰ� ���� �Է��ϰ�
		 for(int i = 0; i<score.length; i++) {
			 int no = (int)(Math.random() * 42 + 60);
			 
			 score[i] = no;
		 }
		
		
		// ������ ����Ѵ�.
		for(int i =0; i<score.length; i++) {
			// �� ������ �̾Ƴ��� �ݺ���
			
			for(int j =0; j<score.length; j++) {
				// �ٸ� �л� ���� �̾Ƴ��� �ݺ���
				
				if(score[j] > score[i]) {
					stud[i] = stud[i] + 1;
				}
				
			}
		}
		
		// ����Ѵ�.
		/*
		 ��� ����:
		 A �л� : 90�� - 2��
		 */
		
		for(int i = 0; i<stud.length; i++) {
			// �л�
			String man = (char)('A' + i) + "";
			// ����
			int num = score[i];
			// ���
			int rank = stud[i];
			// ���
			System.out.println(man + "[�л�]" + num + "�� -" + rank + "��");
		}
		
	}

}
