package day04.ex;

/*
 문제 1-1 
1 ~ 25 의 숙자 3개를 랜덤하게 발생시켜서 
그 수들 중 가장 큰 수, 중간수, 작을수를 출력하는 프로그램을 작성하세요
단, 3항 연산자를 사용해서 처리하세요.
*/

public class Ex01_01 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random() * (25 - 1 + 1) +1);
	      int no2 = (int)(Math.random() * (25 - 1 + 1) +1);
	      int no3 = (int)(Math.random() * (25 - 1 + 1) +1);
	      
	      int temp = (no1 > no2) ? no1 : no2;
	      int max = (temp > no3) ? temp : no3;
	      
	      temp = (no1 < no2) ? no1 : no2;
	      int min = (temp < no3) ? temp : no3;
	      int mid = (no1 > no2) ? ((no1 > no3) ? ((no2 > no3) ? no2 : no3) : no1)
	      : ((no2 > no3) ? ((no1 > no3) ? no1 : no3) : no2);
	      
	      System.out.println("입력한 세 정수 \n\t" + no1 + ", " + no2 + ", " + no3 + "중에서 \n제일 큰수는 " 
	      + max + ", \n중간 수는 " + mid + ", \n작은 수는 " + min + " 입니다.");

		
		      
			
				
	}
}
