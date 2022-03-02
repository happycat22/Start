package day05;

public class Test09 {

//	1~ 숫자를 만들어서 출력하고 50이 되면 반복을 종료하세요
//	for 명령문에 증감식, 조건식, 카운터변수 선언 초기화 부분은 모두 기술하지 않아도 무방하다.
//	이때는 무한반복 처리된다.
	
	public static void main(String[] args) {
		for(int i = 0; ; i++) {
			
//			참고 : for 명령에서 조건식에 아무것도 기술하지 않는 경우는
//			조건식의 결과를 true 로 실행하게 된다 >> 무한반복문
			
			int no = i+1;
			if(no > 50) {
				break;
			}
			System.out.print(no + ", " );
		}
		System.out.println();
	
	}
}
