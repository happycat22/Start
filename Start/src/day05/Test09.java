package day05;

public class Test09 {

//	1~ ���ڸ� ���� ����ϰ� 50�� �Ǹ� �ݺ��� �����ϼ���
//	for ��ɹ��� ������, ���ǽ�, ī���ͺ��� ���� �ʱ�ȭ �κ��� ��� ������� �ʾƵ� �����ϴ�.
//	�̶��� ���ѹݺ� ó���ȴ�.
	
	public static void main(String[] args) {
		for(int i = 0; ; i++) {
			
//			���� : for ��ɿ��� ���ǽĿ� �ƹ��͵� ������� �ʴ� ����
//			���ǽ��� ����� true �� �����ϰ� �ȴ� >> ���ѹݺ���
			
			int no = i+1;
			if(no > 50) {
				break;
			}
			System.out.print(no + ", " );
		}
		System.out.println();
	
	}
}
