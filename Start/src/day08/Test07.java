package day08;
/*
 ���� �ټ����� ����� �迭�� �����,
 ���⸦ �Է��س���  ������ ���� ȭ�鿡 ����ϰ�
 ����ڰ� ������ �Է��ϵ��� �ؼ� ����� �¾Ҵ��� Ȯ���ϴ� ���α׷��� ���弼��.
 */
import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		// ��������
		String quest = "���� �� ����ũ ����� �ƴ� �����?";
		// ���� ���� ���� ��ſ� �ε����� �����ؼ� ����ص� OK
		
		// ���⺯��
		String[] ans = new String[5];
		// �����Է�
		ans[0] = "����";
		ans[1] = "�Ѹ�";
		ans[2] = "����";
		ans[3] = "����";
		ans[4] = "����";
		
		// ���� ��ġ�� ����
		int dap = 1;
		System.out.println();
		
		// ������ �ϼ� �����Ƿ�
		System.out.println(quest); 
		// �������
		for(int i=0; i<ans.length; i++) {
			System.out.println((i +1) +  ")" +"\t" + ans[i]);
		}
		
		// �Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		// �Է¸޽���
		System.out.println("���ù�ȣ : ");
		// �Է� �޾Ƽ� ������ ���
		int no = sc.nextInt() -1;
		
		// ����� ���ؼ� ��� ���
		String result = no == dap ? "����" : "����";
		
		// ��� ���
		System.out.println("������ ��� " + ans[no] + "�� " + result + "�Դϴ�.");
		

	}

}
