package day07;
import java.util.*;
public class Test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] blackpink = new String[4];
		for(int i = 0; i<blackpink.length;i++) {
			System.out.println(blackpink[i]);
		}
		
		blackpink[0] = "����";
		blackpink[1] = "����";
		blackpink[2] = "����";
		blackpink[3] = "����";
		
		System.out.println(Arrays.toString(blackpink)); // �ݵ�� �迭 Ȯ�� �뵵�θ� ����ؾ� �Ѵ�. 
	}

	String[] tmp = new String[5];
	for(int i = 0; i<4; i++) {
		tmp[i] = blackpink[i];
	}
			
		tmp[4] = "�Ѹ�";
		blackpink = tmp;
		
		//�ϳ��� ���
//		�迭�� ���� �����ʹ� �׻� for ����� �����͸� ������ ����ϴµ� ���ϴ�.
		for(String name : blackpink) {
			
		 // �ǹ�: blackpink�� �����͸� ���������� �ϳ��� ������ name ������ ����Ű����.
		//���
			System.out.println(name + " ");

		}
	}

