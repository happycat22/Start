package Ex;
/* ���� 4 ]
	�������� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	������ǥ
		
					�ڵ�		�⺻���		�����
		������		1			3800			245
		�����		2			2400			157
		������		3			2900			169
		�����		4			3200			174
		
		
	�������� 
		�⺻��� + ��뷮 * �����
		
	����� �ڵ�� ��뷮�� �Է��ϸ�
	�������� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	1. �Է� �ޱ� 2. case���� if�� �߰��ؼ� �ۼ��ϱ�
*/
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		int basic = 0;
		int use = 0;
		int use_money = 0;
		int index = 0;
		
		Scanner sc = new Scanner(System.in); // �Է¹ޱ�
		System.out.println("����� �ڵ带 �Է��ϼ���.");
		index = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in); // �Է¹ޱ�
		if(1<=index && index<=4) {
			System.out.println("��뷮�� �Է��ϼ���.");
		}
		
			if(index == 1){
				sc2 = new Scanner(System.in); // �Է¹ޱ�
			use = sc2.nextInt();
				if(use>=245) {
					use_money = 3800;				
				System.out.println("������ = " + (basic + use * use_money)); //�⺻��� + ��뷮 * �����
				}
			}
			else if(index == 2){
				sc2 = new Scanner(System.in); // �Է¹ޱ�
				use = sc2.nextInt();
					if(use>=157) {
						use_money = 2400;				
						System.out.println("������ = " + (basic + use * use_money)); 
						}
			}
					
			else if(index == 3){
				sc2 = new Scanner(System.in); // �Է¹ޱ�
				use = sc2.nextInt();
					if(use>=169) {
						use_money = 2900;				
						System.out.println("������ = " + (basic + use * use_money)); 
						}
			}
			else if(index == 4){
				sc2 = new Scanner(System.in); // �Է¹ޱ�
				use = sc2.nextInt();
					if(use>=174) {
						use_money = 3200;				
						System.out.println("������ = " + (basic + use * use_money)); 
					}
					
			} else {
				System.out.println("1~4 �߿� �Է����ּ���.");
			}
	}
}
		
					
				
							
			

