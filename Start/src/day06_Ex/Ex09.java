package day06_Ex;

/*
문제 9 ]
	1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
	어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
	// 어디까지 계산해야하는지..
	 
	 힌트: 2의 배수일 때만 - 부호를 붙인다.
*/

public class Ex09 {

	public static void main(String[] args) {
		

		int sum = 0;
		int i = 0;
		
		for(i = 1; sum<100; i++) {	//sum의 값이 100을 넘길 때의 조건식
			if (i%2==0) {			// 2의 배수일 때 -값이 붙는다.
				sum+=(-i);	
		}else{					// 그 외 나머지 값은 +
			sum+=i;
		}
	}
		
		System.out.println("총합" + sum + "일 때 해당하는 수는" + i);
		
	}

}


