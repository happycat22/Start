package day08;
/*
 ���ڿ� �������� ����� �迭�� 10���� �����ϴ� �迭�� �����
 'A' - 'J' �� �����ϰ� 100�� �ݺ��ؼ� �����
 �迭�� ī��Ʈ�� �����Ѽ� ����� ����ϼ���.
 */
public class Test12 {
	public static void main(String[] args) {
		int[][] munja = new int[10][2]; // ���� ������ ������ 2�� �� ������ �迭
		
		// ���ڸ� �Է��غ���.
		/*
		munja[0][0] = 'A';
		munja[1][0] = 'B';
		munja[2][0] = 'C';
		
		'A' + 0 ==> 'A'
		'A' + 1 ==> 'B'
		*/
		for(int i = 0 ; i < munja.length ; i++ ) {
			munja[i][0] = 'A' + i;
		}
		
		// �����ϰ� ���ڸ� 100�� �߻����Ѽ� ī��Ʈ�� �÷��ش�.
		
		/*
			
			char ch = 'A';
			'A' ==> munja[ch - 'A'][1] += 1;
		 */
		for(int i = 0 ; i < 100 ; i++ ) {
			char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			
			int idx = ch - 'A';
			/*
			int oldCount = munja[idx][1];
			int newCount = oldCount + 1;
			
			munja[idx][1] = newCount;
			*/
			munja[idx][1] += 1;
		}
		
		// print
		for(int i = 0 ; i < munja.length ; i++ ) {
			
			int[] arr = munja[i];
			
			char ch = (char) arr[0] ; // ������ �ƽ�Ű �ڵ尪�� ������ ���ڷ� ���� ����ȯ
			int count = arr[1]; // ī��Ʈ ��
			
			// Ÿ��Ʋ ���
			System.out.print(ch + " : ");
			
			for(int j = 0 ; j < count ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
