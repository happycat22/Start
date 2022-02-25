package day03.ex;
/*
 Q4. 1년은 365.2426일이다.
 	 이것은 과연 며칠, 몇 시간, 몇 분, 몇 초인지 계산하고 출력하세요.
 	 
 	 힌트) 365.2426일 단위가 일 단위이다.
 	 하루는 24시간.
 	 따라서 0.5일은 12시간을 의미.
 	 
 */

/* 과정
1. 데이터 변수에 기억
2. 누적 계산될 변수 만들고
3. 일수 / 시간 / 분 / 초 
4. 출력하고
 */


public class Ex04 {
	public static void main(String[] args) {
		double total = 365.2426;			// --1
		double tmp = total;				// --2
		
		int day = (int)tmp;
		
		
		
		// 0.2426을 초로 변환
		// 1 * 24   ==> 하루의 시간
		// 0.5 * 24 ==> 하루의 절반 시간
		// 0.1 * 24 ==> 0.1 의 시간
		
		int tsec = (int) (0.2426 * 24 * 60 * 60); // 하루 24시간 * 60분 * 60초
		
		int hours = tsec / 60 / 60;  // 분, 초를 나눠서 빼준다.
				tsec = tsec % 3600;  // == tesc %= 3600;
		int min = tsec / 60;
				tsec %= 60;
				
		int sec = tsec;
				
				
		System.out.println("1년은 " + total + "이고");
		System.out.println("이것은 " + day + "일");
		System.out.println("시간은 " + hours + "시간");
		System.out.println("분은 " + min + "분");
		System.out.println("초는 " + tsec + "초이다.");
		
		
				
	}

}
