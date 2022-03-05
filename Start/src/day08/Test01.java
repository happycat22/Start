package day08;

/*
 0 - 9 사이의 숫자를 100개 발생시켜서
 각각의 숫자가 몇번씩 발생했는지 알아보자
 
 방법: 각 숫자의 횟수를 기억할 배열을 만들고
 각 숫자가 발생할 떄마다 1씩 누적시켜준다.
 */
public class Test01 {
	public static void main(String[] args) {
		
		//할일
//		1. 배열만들고
		int[] numCount = new int[10]; // 초기값은 0으로 셋팅 되어 있다.
// 		이 배열에 위치 값이 9인 위치에는 0이 발생하면 2 누적 시킨다.
//		1인 위치에는 1이 발생하면 1 누적 시킨다.
		
		// 반복작업
		for(int i = 0; i<100; i++) {
//		2. 랜덤하게 숫자 발생시키기
			int no = (int)(Math.random()*10);
//			이렇게 발생된 숫자는 위에 만든 numCount의 위치값으로 사용하고
//			그 위치값의 숫자를 1을 증가시켜주면 된다.
			
//		3. 발생된 숫자의 카운트를 + 1 해주고 
			numCount[no] += 1;
		}
		
//  	4.결과를 출력한다.
		for(int i =0; i<numCount.length; i++) {
			int no = i;	//숫자
			int count = numCount[i]; // 발생한 횟수
			
			//출력
			System.out.println(no + " : " + count);
		}
		System.out.println("====================================");
		// 발생한 횟수를 특수문자를 이용해서 그래프 형태로 출력
		for(int i = 0;i<numCount.length; i++) {
			int count = numCount[i];
			
			System.out.print(i + " : ");
			
			// count 횟수만큼 특수문자를 출력해야 하므로 반복문으로 처리한다.
			for(int  j = 0; j<count; j++) {
				// 출력
				System.out.print("★");
			}
			System.out.println();
		}
		
		/*
		 'A' + 0 ==> 'A'
		 'A' + 1 == > 'B'
		
		 */
	}

}
