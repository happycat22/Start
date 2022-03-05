package day07;
/*
 1~10까지 정수를 순서대로 배열에 기억시키고 
 이 숫자를 랜덤하게 섞어서 출력되도록 하세요.
 
 방법 : 배열의 특정 위치 2개를 꺼내서 데이터를 바꾼다
 이 과정을 많이 하면 할수록 데이터가 섞이게 된다.
 */


public class Test06 {
	public static void main(String[] args) {
		// 1~10을 기억하는 배열을 만든다
		int[] num = new int[10];
		for(int i = 0; i<10; i++) {
			num[i] = i +1;
		}
		
		for(int no : num) {
			System.out.print(no + " | ");
		}
		System.out.println();
		
		// 배열 준비 완.
		// 임의의 숫자 두 개를 랜덤으로 섞는다.(swapping)
		
		for(int i = 0; i<100;i++) {
			int idx1 = (int)(Math.random() * 10);
			int idx2 = (int)(Math.random() * 10);

			if(idx1 == idx2) {
				i--;
				continue;
			}
			// 원래 첫위치의 데이터를 변수에 기억시키고 섞기
			
			int tmp = num[idx1];
			num[idx1] = num[idx2];
			num[idx2] = tmp;
		}
			//출력
			for(int no : num) {
				System.out.print(no + " | ");
			}
			System.out.println();
		}
	}


