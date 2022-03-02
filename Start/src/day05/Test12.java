package day05;
 // 구구단을 출력하세요
public class Test12 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println();
		}

	}

}
