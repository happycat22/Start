package day08;

/*
 �л�����  java, db, web, jsp, spring ������ ����� �迭�� �����
 �� ������ ������ �����ϰ� ���� �Է��ϰ� 
 ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Test11 {

	public static void main(String[] args) {
		int[][] stud = new int[3][5]; // 3���� �л��� 5���� ���� �迭
		for(int i=0; i<stud.length; i++) {
			for(int j = 0; j < stud[i].length; j++) {	// �л� ���� �ݺ���
				System.out.print(stud[i][j] + " | ");	// ���õ� �л��� ������ ���� �ݺ���
			}
			System.out.println();
		}
		// ���� ���� �Է�
		for(int i = 0; i <stud.length; i++) {
			// �л� ���õ� ����
			 for(int j = 0; j <stud[i].length; j++) {
				 // ���õ� �л��� ������ ������ ����
				 
				 // ���� ���� �����ϰ� �Է�
				 stud[i][j] = (int)(Math.random() * 41 + 60);
			 }
		}
		
		// ���
	System.out.println();
	System.out.println("##############");
	
	
	for(int i=0; i<stud.length; i++) {
		for(int j = 0; j < stud[i].length; j++) {	// �л� ���� �ݺ���
			System.out.print(stud[i][j] + " | ");	// ���õ� �л��� ������ ���� �ݺ���
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("##############");
	
	// ���� ���ϱ�
	// ������ ������ �迭
	int[] total = new int[3];
	for(int i = 0; i<stud.length; i++) {
		for(int j = 0; j<stud[i].length; j++) {
			total[i] += stud[i][j];
		}
	}
	
	// ���
	for(int t: total) {
		System.out.println("####" + t);
		}

	}
}
