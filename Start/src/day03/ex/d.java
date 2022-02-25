package day03.ex;

public class d {
	public static void main(String[] args) {
		float year = 365.2426f;
		float _year = year;
		int day = (int)year;
		float hours = 0;
		float _hours = 0;
		float minutes = 0;
		float _minutes = 0;
		float seconds = 0;
		
		_year -= day;	// 365빼고 나머지 소수점으로 계산
		hours = _year * 24.0f;
		_hours  = hours / 10;
		
		minutes = _hours * 60;
		_minutes = minutes / 100;
		
		seconds = _minutes * 60;
		
		System.out.print(year + "일 : ");
		System.out.print(day + "일 ");
		System.out.print((int)hours + "시간 ");
		System.out.print((int)minutes + "분 ");
		System.out.print((int)seconds + "초");
	}
}
	
