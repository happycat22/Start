package day06;
/*
 ���� 1
 3 ~ 100 ������ ������ �Է� �޾Ƽ� �� ������ �Ҽ����� �Ǵ��ϴ� ���α׷��� �ۼ��ϼ���.
 ����: 
 �Ҽ���, 1�� �ڽ����θ� �������� ��. 
 
 ���ʽ� ]
		3 ~ 100 ������ ���� �߿��� �Ҽ��� ��� ����ϼ���.
 */

import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3~100������ ������ �Է��ϼ���.");
		int num = sc.nextInt();
		
		int count=0;
		for(num = 3;num<=100;num++) {
			for(int j=3;j<=num; j++) {
				if(num%j==0) {
					count ++;
					if(count == 1) {
						System.out.println("�Ҽ��Դϴ�.");
					} else if(count != 1){
						System.out.println("�Ҽ��� �ƴմϴ�.");
				}
			}
		}
			
				
			
	}
		

}

}
