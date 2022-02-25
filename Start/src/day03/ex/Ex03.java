package day03.ex;

// Q1. 84232원을 지불하려고 한다. 우리나라 화폐단위로 이 금액을 지불하려면
// 각 단위가 몇 개씩 필요한지 계산해서 출력하시오
public class Ex03 {
	public static void main(String[] args) {
		int total = 84232;
				
		int tmp = total; // 값이 점점 줄어들 거니까 tmp로 변경??1
		
		// 5만원권
		int oman = tmp / 50000;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 50000;				// 같음 ) tmp %= 10000; 
										// tmp를 50000으로 나눈 나머지를 tmp에 대입하세요.
		//1만원권
		int man = tmp / 10000;
		tmp = tmp % 10000; 			// 1만원권을 제외한 금액
		
		//5000원권
		int ocheon = tmp / 5000;
		tmp = tmp % 5000;
		
		//1000원권
		int cheon = tmp / 1000;
		tmp = tmp % 1000;
		
		//500원권
		int obeak = tmp / 500;
		tmp = tmp % 500;
				
		//100원권
		int beak = tmp / 100;
		tmp = tmp % 100;
		
		//50원권
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		//10d원권
		int ship = tmp / 10;
		
		//1
		int il = tmp %10;
		
		//결과출력
		System.out.println("총금액" + total + "원은");
		System.out.println("오만원권 : " + oman + "장");
		System.out.println("만원권 : " + man + "장");
		System.out.println("오천원권 : " + ocheon + "장");
		System.out.println("천원권 : " + cheon + "장");
		System.out.println("오백원권 : " + obeak + "장");
		System.out.println("백원권 : " + beak + "장");
		System.out.println("오십원권 : " + oship + "장");
		System.out.println("백원권 : " + ship + "장");
		System.out.println("일원권 : " + il + "장");
		
		
	}
}

/* 답
 * 총금액84232원은
오만원권 : 1장
만원권 : 3장
오천원권 : 0장
천원권 : 4장
오백원권 : 0장
백원권 : 2장
오십원권 : 0장
백원권 : 3장
일원권 : 2장
*/

