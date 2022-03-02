package Ex;
//
//Ex02
//	'A' 부터 문자를 10개 만들어서 출력하세요.


public class Ex02 {

	public static void main(String[] args) {
		
	
		for(int i = 0; i<10; i++) {
			int alp = i + 65;
			char str = (char)alp;
			System.out.print(str);
		}
		System.out.println();
		
		int i = 0;
		for(i = 0; i<10; i++) {
			char ch = 'A';
				System.out.printf((char)(ch + i)+" ");				
		}
		System.out.println();
		System.out.println("### i : " + i);
	}

}
