package day04.ex;

/*
 3�ڸ� ���� (100~999)�� �Է¹޾Ƽ� 
 �� ���ڿ� ���� ����� 100�� ����� ����� ���ؼ���
 �󸶰� �ʿ����� ����ؼ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 
 ex) 241 �� 200�� �����Ƿ� 41�� �����Ѵ�.
  	 777 �� 800�� �����Ƿ� 23�� ���ؾ� �Ѵ�.
 */


public class Ex05 {
	public static void main(String[] args) {
		// ���ڸ� ������ �Է¹޴´�.
		String sno = JOptionPane.showInputDialog("���ڸ����� : ");
		// �Է¹��� �����ʹ� ���������� ���ڿ��̹Ƿ� ������ ��ȯ����� �Ѵ�.
		// ���� ������ ���ڿ��� ������ ��ȯ���ִ� ����� ������ �ִ� �Լ���
//		integer.parseInt(���ڿ�)
		int no = Integer.parseInt(sno);
		
		// 10���� ���ϸ� �����س���.
//		int num = no - (no / 100*100);
		int num = no % 100;
		
		// num�� 50���� ū�� �Ǻ��Ѵ�.
		int sum = 1;
		int result = 0;
		
		sum = num > 50 ? 100 - num // 76 ==> 100-76�� ������� �Ѵ�.
				: num ; 
		
//		result = num > 50 ? no + sum : no - sum
		result = num > 50 ? (no / 100 + 1) * 100 : (no / 100) * 100 ;
		String str = num > 50 ? "��������Ѵ�." : "������Ѵ�.";
		
		//���
		System.out.println("�Է������� " + no + "��" + result + "�����Ƿ�" + sum + "��" + str);
	}

}
