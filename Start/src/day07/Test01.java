package day07;

public class Test01 {

	public static void main(String[] args) {
		/* ���� 6���� ������ �� �迭 arr�� �����
		 1~6���� ä���� �Ѱ��� ���ʼ� ����ϼ���.
		  
		 // �迭 ���� ����
		  �迭 ������ ���� ���� : ������Ÿ�� [] ����;
//		 */
//		
		int[] arr;
//		// �迭 ���� �ʱ�ȭ
		arr = new int[6];
//		
//		// ���
//		// ����: �迭�� ���̸� �˾Ƴ��� ���
		int len = arr.length;
		for(int i = 0; i<len; i++) {
//			//�迭�� ���� ������ ������ ���
//			// �迭 ����[��ġ��]
			int no = arr[i];
		System.out.println(no);
		}
		
//		����ũ ����� �̸��� ����� �迭�� ����� ����ϼ���.
//		����ũ�� 4������ �����Ǿ� �ֽ��ϴ�.
//		����, ����, ����, ����

		
		String[] blackpink = new String[4];
		for(int i = 0; i<blackpink.length;i++) {
			System.out.println(blackpink[i]);
		}
	}

}
