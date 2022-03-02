package Ex;
/*
문제 10 ]
	주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
	1. 두개의 경우의 식이 필요하다.
*/

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) {
			for(int j=1; j<6; j++) {
				int sum = i + j;
				if(sum==6) {
					System.out.println("두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 경우의 수 : ");
					System.out.println(i + "+" + j + "=" + sum);
				}
			}
		}
			
		}
		
	}
