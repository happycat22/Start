package day07;

public class Test06_1 {

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
				
				for(int i = 0; i<num.length; i++) {
					int idx1 = (int)(Math.random() * 10);
					int idx2 = (int)(Math.random() * 10);
					
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
