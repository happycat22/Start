package Ex;
/*
���� 10 ]
	�ֻ��� 2���� ���� ��� ���� ���� 6�� �Ǵ� ��츦 ��� ����ϼ���.
	1. �ΰ��� ����� ���� �ʿ��ϴ�.
*/

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) {
			for(int j=1; j<6; j++) {
				int sum = i + j;
				if(sum==6) {
					System.out.println("�� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ����� �� : ");
					System.out.println(i + "+" + j + "=" + sum);
				}
			}
		}
			
		}
		
	}
