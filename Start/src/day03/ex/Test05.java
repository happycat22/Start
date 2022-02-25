package day03.ex;

public class Test05 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		
		int no3 = no1++ + ++no2;
		//no1++ 뒤에 증감연산자 ++을 붙이면 이 바로 뒤에 오는 no1(변수)에게 딱 한 번만 +1
		//앞에 ++를 붙이면 지금부터 바로 적용!
		
		System.out.println("no1 : " + no1);
		System.out.println("no1 : " + no1);
		System.out.println("no1 : " + no2);
		System.out.println("no3 : " + no3);
				
	}
}
