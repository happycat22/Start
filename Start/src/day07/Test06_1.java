package day07;

public class Test06_1 {

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
				
				for(int i = 0; i<num.length; i++) {
					int idx1 = (int)(Math.random() * 10);
					int idx2 = (int)(Math.random() * 10);
					
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
