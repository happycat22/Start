package day07;
import java.util.*;
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
		
		// ����̸� �߰�
				blackpink[0] = "����";
				blackpink[1] = "����";
				blackpink[2] = "����";
				blackpink[3] = "����";
				
				// ��� - ����Ȯ�ο�
				System.out.println(Arrays.toString(blackpink));
				
				// �����͸� �ϳ��� ������ ���
				for(int i = 0 ; i < blackpink.length /* <=== int len = blackpink.length; */; i++ ) {
					/*
						���� ]
							�������� �����͸� �����ϴ� ������Ÿ�Ե���
							������ �Ѱ��� ������ ���� �� �������� Ÿ���� ���� �����غ��� �Ѵ�.
					 */
					
					// i��°�� ����� �̸��� ������ ������ ���
					String name = blackpink[i];
					
					// ������ ���� �����͸� ���
					System.out.println(name);
				}
				
				// �Ѹ� ����� �߰��ؼ� ����ϼ���.
				/*
					���� ]
						�迭�� �ѹ� ��������� ũ��� Ÿ���� ������ �� ����.
						���� �������� ������ ������ �ʿ��ϸ�
						�迭�� �ٽ� ���� ������ �����Ѿ� �Ѵ�.
				 */
				
				// �迭�� �ٽø����
				String[] tmp = new String[5];
				for(int i = 0 ; i < 4 ; i++ ) {
					tmp[i] = blackpink[i];
				}
				// �̷��� �ϸ� �ټ���° ���� ���� ����ִ�.
				tmp[4] = "�Ѹ�";
				
				blackpink = tmp;
				
				//  �ϳ��� ������ ���
				// �迭�� ���� �����ʹ� ���� for ���(forEach ���)�� ���̸� ������ ����ϴµ� ���ϴ�.
				for(String name : blackpink) {
					// �ǹ� ] blackpink�� �����͸� ���������� �ϳ��� ������ name ������ ����Ű����.
					
					// ���
					System.out.print(name + " ");
				}
				System.out.println();
				
			/*
				// ���� for ��� ���
				ArrayList<String> list = new ArrayList<String>();
				
				list.add("����");
				list.add("����");
				list.add("����");
				list.add("����");
				
				// ���
				for(String name : list) {
					System.out.print(name + " | ");
				}
			*/
				
				
			}

		}