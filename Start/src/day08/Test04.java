package day08;
import java.util.Arrays;
public class Test04 {


	public static void main(String[] args) {
	/*
		���� 5���� ����� �迭�� �����
		�����͸� ä���� ��
		1�� �濡������ 3��������� �����͸�
		�ٸ� �迭�� ���� ���縦 �غ���.
		
		�̶� ����� �迭�� ���̸� 10���� �ϼ���.
	 */

			// origin
			int[] ori = {10, 20, 30, 40, 50};
			
			// toCopy
			int[] copy = new int[10];
			
			// ���� ���縦 �Ѵ�.
			System.arraycopy(ori, 0, copy, 0, 3);
			
			// �迭 ���� ���
			// ori
			System.out.println("ori  : " + Arrays.toString(ori));
			// copy
			System.out.println("copy : " + Arrays.toString(copy));
		}

	}
