package day06_Ex;

/*
���� 11 ]
	2x + 4y = 10  �������� ����� ����ϼ���.
	��, x, y�� ��� 
		0 <= x, y <= 10
	������ �����̴�.
*/

public class Ex11 {

	public static void main(String[] args) {
		int sum = 0;
		for(int x = 0; x>=0; x++) {
			for(int y = 0; y<=10; y++) {
				if((2*x) + (4*y) == 10) {
					System.out.println("x = " + x + ", y = " + y);
					break;
				}
				
			}
		}
	}

}
